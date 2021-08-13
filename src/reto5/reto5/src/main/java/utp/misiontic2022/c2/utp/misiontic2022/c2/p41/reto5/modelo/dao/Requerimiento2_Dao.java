/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.util.JDBCUtilities;

/**
 *
 * @author Diego_Orozco
 */
public class Requerimiento2_Dao {
    Connection cnn;

    public Requerimiento2_Dao() {
        try {
            this.cnn = JDBCUtilities.getConnection();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void close() throws SQLException{
        cnn.close();
    }
    
    public ArrayList<Requerimiento_2> requerimiento2(){
        ArrayList<Requerimiento_2> res = new ArrayList<>();
        
        String consulta = "select c.ID_Proyecto, c.Proveedor, c.Pagado, mc.ID_MaterialConstruccion, mc.Nombre_Material"+
             " from compra c "+
            "inner join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
            "where c.Proveedor = 'Homecenter' and c.Pagado = 'No' order by c.ID_Proyecto;";        
        try {
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.add(
                    new Requerimiento_2(
                        rs.getInt("ID_Proyecto"), 
                        rs.getString("Proveedor"),
                        rs.getString("Pagado"),
                        rs.getInt("ID_MaterialConstruccion"),
                        rs.getString("Nombre_Material")
                    )
                );
            }
        } catch (SQLException e) {
            System.err.print("Error consultando Materiales no pagados al proveedor Homecenter: " + e);
        }
        return res;
    }
    
    
}
