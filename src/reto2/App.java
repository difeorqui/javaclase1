public class App {
    public static void main(String[] args) {
	    // Casos de Pruebas
        Vehiculo vehiculos[] = new Vehiculo[4];
        vehiculos[0] = new Carro(10000, true, "Mazda", 2015);
        vehiculos[1] = new Carro(8000, true, "Renault", 2010);
        vehiculos[2] = new Moto(5000, true, "Yamaha", 2015);
        vehiculos[3] = new Moto(3000, true, "Suzuki", 2012);
        PrecioTotal solucion = new PrecioTotal(vehiculos);
        solucion.mostrarTotales();
        
        Vehiculo vehiculos2[] = new Vehiculo[4];
        vehiculos2[0] = new Carro(10000, false, "Mazda", 2015);
        vehiculos2[1] = new Carro(8000, false, "Renault", 2010);
        vehiculos2[2] = new Moto(5000, false, "Yamaha", 2015);
        vehiculos2[3] = new Moto(3000, false, "Suzuki", 2012);
        PrecioTotal solucion2 = new PrecioTotal(vehiculos2);
        solucion2.mostrarTotales();
    }
}
