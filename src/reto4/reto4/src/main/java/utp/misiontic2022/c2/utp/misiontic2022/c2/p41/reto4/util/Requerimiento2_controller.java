/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util;

import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.dao.Requerimiento2_Dao;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_2;

public class Requerimiento2_controller {
    private Requerimiento2_Dao ctrl;

    public Requerimiento2_controller() {
        this.ctrl = new Requerimiento2_Dao();
    }
    
    public ArrayList<Requerimiento_2> requerimiento2(){
        return this.ctrl.requerimiento2();
    }
    
    public void close() throws SQLException{
        this.ctrl.close();
    }
}
