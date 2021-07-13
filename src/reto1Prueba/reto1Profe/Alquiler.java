import java.util.Date;

public class Alquiler {
    private int idAlquiler;
    private int idVehiculo;
    private int idCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;

    public Alquiler(int idAlquiler,int idVehiculo, int idCliente, Date fechaAlquiler) {
        this.idAlquiler = idAlquiler;
        this.idVehiculo = idVehiculo;
        this.idCliente = idCliente;
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }
    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }
    public int getIdVehiculo() {
        return idVehiculo;
    }
    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public Date getfechaDevolucion() {
        return fechaDevolucion;
    }
    public void setfechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
