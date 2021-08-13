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
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.util.JDBCUtilities;

/**
 *
 * @author Diego_Orozco
 */
public class Requerimiento1_Dao {
    Connection cnn;

    public Requerimiento1_Dao() {
        try {
            this.cnn = JDBCUtilities.getConnection();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void close() throws SQLException{
        cnn.close();
    }
    
    public ArrayList<Requerimiento_1> requerimiento1(){
        ArrayList<Requerimiento_1> res = new ArrayList<>();
        
        String consulta = "select count(l.ID_Lider) numLideres, "+
                          "l.Ciudad_Residencia"+
                          " from Lider l "+
                          "group by l.Ciudad_Residencia;";
        try {
            PreparedStatement ps = cnn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.add(new Requerimiento_1(rs.getInt("numLideres"), rs.getString("Ciudad_Residencia")));
            }
        } catch (SQLException e) {
            System.err.print("Error consultando Número de lideres por ciudad: " + e);
        }
        return res;
    }
    
    
}
