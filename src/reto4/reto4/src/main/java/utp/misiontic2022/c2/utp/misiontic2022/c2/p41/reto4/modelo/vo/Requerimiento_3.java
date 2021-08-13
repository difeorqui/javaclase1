/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo;

/**
 *
 * @author Diego_Orozco
 */
public class Requerimiento_3 {
    private int id_lider;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;

    public Requerimiento_3(int id_lider, String nombre, String primer_apellido, String segundo_apellido) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public int getId_lider() {
        return id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }
}
