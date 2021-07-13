public class Reto1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Juan", "Perez", 30, "10/07/1991");
        Vehiculo vehiculo1 = new Vehiculo(1, "Mazda", 2021, "3", "Automovil", "Descapotado");

        Alquiler alquiler1 = cliente1.alquilarVehiculo(1, vehiculo1, cliente1);
        cliente1.devolverVehiculo(alquiler1);

        // Cliente
        System.out.println(
                            cliente1.getIdCliente() + "\n" +
                            cliente1.getNombre() + "\n" +
                            cliente1.getApellido() + "\n" +
                            cliente1.getEdad() + "\n" +
                            cliente1.getFecha_nacimiento() + "\n");
        // Vehículo
        System.out.println(
                            vehiculo1.getIdVehiculo() + "\n" +
                            vehiculo1.getMarca() + "\n" +
                            vehiculo1.getModelo() + "\n" +
                            vehiculo1.getReferencia() + "\n" +
                            vehiculo1.getTipo() + "\n" +
                            vehiculo1.getEstado() + "\n");
        // Alquiler
        System.out.println(
                            alquiler1.getIdAlquiler() + "\n" +
                            alquiler1.getIdCliente() + "\n" +
                            alquiler1.getIdVehiculo() + "\n" +
                            alquiler1.getFechaAlquiler() + "\n" +
                            alquiler1.getfechaDevolucion() + "\n");

    }
}
