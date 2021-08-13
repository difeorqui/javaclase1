/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.util;

import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.modelo.dao.Requerimiento3_Dao;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.modelo.vo.Requerimiento_3;

/**
 *
 * @author Diego_Orozco
 */
public class Requerimiento3_controller {
    private Requerimiento3_Dao ctrl;

    public Requerimiento3_controller() {
        this.ctrl = new Requerimiento3_Dao();
    }
    
    public ArrayList<Requerimiento_3> requerimiento3(){
        return this.ctrl.requerimiento3();
    }
    
    public void close() throws SQLException{
        this.ctrl.close();
    }
}
