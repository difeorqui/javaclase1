/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto5.modelo.vo;

/**
 *
 * @author Diego_Orozco
 */
public class Requerimiento_1 {
    private int nro_lideres;
    private String ciudad_residencia;

    public Requerimiento_1(int nro_lideres, String ciudad_residencia) {
        this.nro_lideres = nro_lideres;
        this.ciudad_residencia = ciudad_residencia;
    }

    public int getNro_lideres() {
        return nro_lideres;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }


}
