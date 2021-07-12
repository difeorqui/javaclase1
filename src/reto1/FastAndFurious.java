package reto1;

import java.util.Date;
import java.util.Scanner;

class Vehiculo {
    private boolean disponible;
    private String tipo;

    // Constructor
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    // Get del tipo
    public String getTipo() {
        return tipo;
    }
    // Get disponible
    public boolean isDisponible() {
        return this.disponible;
    }
    // Set disponible
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}

class Cliente {
    private String nombre;
    private Alquiler alquiler;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Alquiler alquilarVehiculo(Integer idAlquiler, Vehiculo vehiculo, Cliente cliente) {
        this.alquiler = new Alquiler(idAlquiler, vehiculo, cliente);
        return this.alquiler;
    }

    public Alquiler devolverVehiculo(Alquiler alquiler) {
        alquiler.setFechaFinal(new Date());
        alquiler.getVehiculo().setDisponible(true);

        this.alquiler = alquiler;
        return this.alquiler;
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
        int tipoNum = 0;
        String tipo = "";
        do {
            System.out.print("\nDigite el valor según el tipo de vehículo [0] para Carro o [1] para Moto:");
            tipoNum = sc.nextInt();
        } while (tipoNum == 0 || tipoNum == 1);

        if(tipoNum == 0) {
            tipo = "Carro";
        } else {
            tipo = "Moto";
        }
        sc.close();

        Vehiculo vehiculo = new Vehiculo(tipo);
        Cliente cliente = new Cliente(nombre);
        
        int idAlquiler = (int)Math.floor(Math.random()*(9000000-1000000+1)+1000000);

        Alquiler alquiler = cliente.alquilarVehiculo(idAlquiler, vehiculo, cliente);
        alquiler = cliente.devolverVehiculo(alquiler);

    }

}