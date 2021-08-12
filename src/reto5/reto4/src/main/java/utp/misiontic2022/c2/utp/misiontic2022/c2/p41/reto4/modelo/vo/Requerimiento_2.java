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
public class Requerimiento_2 {
    private int id_proyecto;
    private String proveedor;
    private String pagado;
    private int id_material_construccion;
    private String nombre_material;

    public Requerimiento_2(int id_proyecto, String proveedor, String pagado, int id_material_construccion, String nombre_material) {
        this.id_proyecto = id_proyecto;
        this.proveedor = proveedor;
        this.pagado = pagado;
        this.id_material_construccion = id_material_construccion;
        this.nombre_material = nombre_material;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getPagado() {
        return pagado;
    }

    public int getId_material_construccion() {
        return id_material_construccion;
    }

    public String getNombre_material() {
        return nombre_material;
    }
    
    
}
