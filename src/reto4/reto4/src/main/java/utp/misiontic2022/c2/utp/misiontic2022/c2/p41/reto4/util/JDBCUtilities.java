/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego_Orozco
 */
public class JDBCUtilities {

    //Atributos de clase para gestión de conexión con la base de datos      
    private static final String UBICACION_BD = "ProyectosConstruccion.db";    

    public static Connection getConnection() {
        String url = "jdbc:sqlite:" + UBICACION_BD;        
        try {
            return DriverManager.getConnection(url);
        } catch (Exception e) {
            return null;
        }
    }
    
    public static boolean estaVacia(){
        File archivo = new File(JDBCUtilities.UBICACION_BD);        
        return archivo.length() == 0;
    }

    
    
}