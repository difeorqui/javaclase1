public class PrecioTotal {
    private double totalVehiculos;
    private double totalCarros;
    private double totalMotos;
    private Vehiculo[] vehiculos;

    public PrecioTotal(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
        this.totalCarros = 0.0;
        this.totalMotos = 0.0;

        for (int i = 0; i < vehiculos.length; i++) {
            String tipo = vehiculos[i].getClass().getName().toLowerCase();

            if (tipo.equals("carro")) {
                this.totalCarros += vehiculos[i].getPrecioFinal();
            } else {
                this.totalMotos += vehiculos[i].getPrecioFinal();
            }
        }

        this.totalVehiculos = this.totalCarros + this.totalMotos;

    }

    public void mostrarTotales() {
        // Calculos
        System.out.println("El precio total de los Vehiculos es de " + this.totalVehiculos);
        System.out.println("La suma del precio de los Carros es de  " + this.totalCarros);
        System.out.println("La suma del precio de las Motos es de " + this.totalMotos);
        System.out.println("\n\n");
    }
}
