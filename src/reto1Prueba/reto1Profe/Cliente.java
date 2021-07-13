import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int edad;
    private String fecha_nacimiento;

    public Cliente(Integer idCliente, String nombre, String apellido, int edad, String fecha_nacimiento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Alquiler alquilarVehiculo(Integer idAlquiler, Vehiculo vehiculo, Cliente cliente) {
        Date fecha = new Date();
        Alquiler alquiler = new Alquiler(idAlquiler, vehiculo.getIdVehiculo(), cliente.getIdCliente(), fecha);

        return alquiler;
    }

    public void devolverVehiculo(Alquiler alquiler) {
        Date fecha = new Date();
        alquiler.setfechaDevolucion(fecha);
    }
}
