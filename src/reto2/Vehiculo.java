public class Vehiculo {
    private final double precioBase;
    private final boolean lujo;
    private String marca;
    private int modelo;
    private double precioFinal;

    public Vehiculo(double precioBase, boolean lujo, String marca, int modelo) {
        this.precioBase = precioBase;
        this.lujo = lujo;
        this.marca = marca;
        this.modelo = modelo;
    }
    // Los getters y setters de ser necesario

    public double getPrecioBase() {
        return precioBase;
    }
    public String getMarca() {
        return marca;
    }
    public boolean getLujo() {
        return lujo;
    }
    public int getModelo() {
        return modelo;
    }
    // Resultados
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }



}
