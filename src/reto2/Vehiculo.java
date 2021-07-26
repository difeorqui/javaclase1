public class Vehiculo {
    private final double precioBase;
    private final boolean lujo;
    private String marca;
    private int modelo;
    private double precioFinal;
    private int nroLlantas;

    public Vehiculo(double precioBase, boolean lujo, String marca, int modelo, int nroLlantas) {
        this.precioBase = precioBase;
        this.lujo = lujo;
        this.marca = marca;
        this.modelo = modelo;
        this.nroLlantas = nroLlantas;
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
    public int getNroLlantas() {
        return nroLlantas;
    }
    // Resultados
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }
}
