/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.vista;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.Requerimiento1_controller;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.Requerimiento2_controller;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.Requerimiento3_controller;

/**
 *
 * @author Diego_Orozco
 */
public class VistaRequerimientos {
    Scanner sc;
    
    public VistaRequerimientos() {
        sc = new Scanner(System.in);
    }
    
    public void menu() {
        var opcion = 1;
        while (opcion != 0) {            
            System.out.println("============================");
            System.out.println("Asociación H&L Constructores");
            System.out.println("============================");
            System.out.println("1 - Número de líderes por ciudad.");
            System.out.println("2 - Materiales sin cancelar a Homecenter.");
            System.out.println("3 - Líder y proyectos con deuda.");
            System.out.println("0 - Finalizar");
            try {
                opcion = Integer.valueOf(sc.nextInt());
            } catch (Exception e) {
                opcion = 9;
            }
            switch (opcion) {
                case 1:
                    ejecutarRequerimiento1();
                    break;
                case 2:
                    ejecutarRequerimiento2();
                    break;
                case 3:
                    ejecutarRequerimiento3();
                    break;
            }
        }
        
        sc.close();
    }
 
    private void ejecutarRequerimiento1() {
        try {
            Requerimiento1_controller ctrl = new Requerimiento1_controller();
            ArrayList<Requerimiento_1> resultado = ctrl.consultar();
            ctrl.close();
            System.out.println("Nro_Lideres Ciudad_Residencia");
            for (Requerimiento_1 rq : resultado) {
                System.out.println(rq.getNro_lideres() + " " + rq.getCiudad_residencia());
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }

    private void ejecutarRequerimiento2() {
        try {
            Requerimiento2_controller ctrl = new Requerimiento2_controller();
            ArrayList<Requerimiento_2> resultado = ctrl.consultar();
            ctrl.close();
            System.out.println("ID_Proyecto Proveedor Pagado  ID_MaterialConstruccion  Nombre_Material");
            for (Requerimiento_2 rq : resultado) {
                System.out.println(
                        rq.getId_proyecto() + " " + 
                        rq.getProveedor() + " " + 
                        rq.getPagado() + " " + 
                        rq.getId_material_construccion() + " " + 
                        rq.getNombre_material()
                );
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }

    private void ejecutarRequerimiento3() {
        try {
            Requerimiento3_controller ctrl = new Requerimiento3_controller();
            ArrayList<Requerimiento_3> resultado = ctrl.consultar();
            ctrl.close();
            System.out.println("ID_Lider Nombre Primer_Apellido Segundo_Apellido");
            for (Requerimiento_3 rq : resultado) {
                System.out.println(
                        rq.getId_lider() + " " + 
                        rq.getNombre() + " " + 
                        rq.getPrimer_apellido() + " " + 
                        rq.getSegundo_apellido()
                );
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }
    
}
