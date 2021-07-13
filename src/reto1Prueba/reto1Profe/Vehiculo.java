public class Vehiculo {
    private int idVehiculo;
    private String marca;
    private int modelo;
    private String referencia;
    private String tipo;
    private String estado;

    public Vehiculo(int idVehiculo, String marca, int modelo, String referencia, String tipo, String estado){
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.referencia = referencia;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }
    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
