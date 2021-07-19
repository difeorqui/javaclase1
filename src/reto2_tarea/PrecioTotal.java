// Inicio de la solución 
public class PrecioTotal { 
    // Atributos 
    double totalOtrosElectrodomesticos;
    double totalLavadoras;
    double totalTelevisiones;
    // Constructor 
    PrecioTotal(Electrodomestico[] pElectrodomesticos) { 
        this.totalOtrosElectrodomesticos=0;
        this.totalLavadoras=0;
        this.totalTelevisiones=0;
        for (Electrodomestico electrodomestico : pElectrodomesticos) {
            if (electrodomestico.getClass().getName().equalsIgnoreCase("lavadora")) {
                this.totalLavadoras += electrodomestico.calcularPrecio();
            } else if (electrodomestico.getClass().getName().equalsIgnoreCase("television")) {
                this.totalTelevisiones += electrodomestico.calcularPrecio();
            } else {
                this.totalOtrosElectrodomesticos += electrodomestico.calcularPrecio();
            }
        }
    } 
    // Metodos 
    public void mostrarTotales() { 
        // Código 
        double totalElectrodomesticos = this.totalOtrosElectrodomesticos + this.totalLavadoras + this.totalTelevisiones;       
        // Mostramos los resultados 
        System.out.println("La suma del precio de los electrodomésticos es de " + totalElectrodomesticos); 
        System.out.println("La suma del precio de las lavadoras es de " + this.totalLavadoras); 
        System.out.print("La suma del precio de las televisiones es de " + this.totalTelevisiones); 
    } 
}