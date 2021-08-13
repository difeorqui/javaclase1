/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.JDBCUtilities;

public class Requerimiento3_Dao {
    Connection cnn;

    public Requerimiento3_Dao() {
        try {
            this.cnn = JDBCUtilities.getConnection();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void close() throws SQLException{
        cnn.close();
    }
    
    public ArrayList<Requerimiento_3> requerimiento3(){
        ArrayList<Requerimiento_3> res = new ArrayList<>();
        
            String consulta = "select distinct l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido"+
                              " from proyecto p "+
                              "inner join lider l on p.ID_Lider = l.ID_Lider";
        try {
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.add(
                    new Requerimiento_3(
                        rs.getInt("ID_Lider"), 
                        rs.getString("Nombre"),
                        rs.getString("Primer_Apellido"),
                        rs.getString("Segundo_Apellido")
                    )
                );
            }
        } catch (SQLException e) {
            System.err.println("Error consultando Proyectos que deben dinero por compra de materiales: " + e);
        }
        return res;
    }
}
