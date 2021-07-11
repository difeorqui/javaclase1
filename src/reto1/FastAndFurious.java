package reto1;

import java.util.Date;
import java.util.Scanner;

class Vehiculo {
    private boolean disponible;
    private String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}

class Cliente {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
}


class Alquiler {
    private int idAlquiler;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Date fechaInicial;
    private Date fechaFinal;

    public Alquiler(Integer idAlquiler, Vehiculo vehiculo, Cliente cliente){
        this.idAlquiler = idAlquiler;
        this.vehiculo = vehiculo;
        this.cliente = cliente;

        int dias = (int)(Math.random() * 15) + 1;
        int milisegundos = (dias*24*60*60*1000);
        this.fechaInicial = new Date(new Date().getTime() - milisegundos);
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }


}

public class FastAndFurious {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nombre del cliente:");
        var nombre = sc.nextLine();
        System.out.print("Selecciona el tipo de vehílo (Carro o Moto):");
        var tipo = sc.nextLine();
        sc.close();

        Vehiculo vehiculo = new Vehiculo(tipo);
        Cliente cliente = new Cliente(nombre);
        
        int idAlquiler = (int)Math.floor(Math.random()*(9000000-1000000+1)+1000000);

        Alquiler alquiler = alquilarVehiculo(idAlquiler, vehiculo, cliente);
        alquiler = devolverVehiculo(alquiler);

    }

    public static Alquiler alquilarVehiculo(Integer idAlquiler, Vehiculo vehiculo, Cliente cliente) {
        Alquiler alquiler = new Alquiler(idAlquiler, vehiculo, cliente);
        return alquiler;
    }

    public static Alquiler devolverVehiculo(Alquiler alquiler) {
        alquiler.setFechaFinal(new Date());
        return alquiler;
    }
}