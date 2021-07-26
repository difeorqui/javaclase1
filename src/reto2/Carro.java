public class Carro extends Vehiculo {

    public Carro(double precioBase, boolean lujo, String marca, int modelo) {
        super(precioBase, lujo, marca, modelo, 4);
        calcularPrecio();
    }

    public Carro(double precioBase, boolean lujo, String marca, int modelo, int nroLlantas) {
        super(precioBase, lujo, marca, modelo, nroLlantas);
        calcularPrecio();
    }

    public void calcularPrecio() {
        double precioBase = this.getPrecioBase();
        boolean lujo = this.getLujo();
        String marca = this.getMarca();
        int modelo = this.getModelo();
        double precio = 0.0;

        // Calculos
        if(marca.equalsIgnoreCase("mazda")) {
            precio = 10000.0;
            if (modelo > 2012) {
                precio += 15000;
                if (lujo) {
                    precio += 10000;
                }
            } else {
                precio += 10000;
                if (lujo) {
                    precio += 8000;
                }
            }
        } else if(marca.equalsIgnoreCase("renault")) {
            precio = 8000.0;
            if (modelo > 2012) {
                precio += 12000;
                if (lujo) {
                    precio += 8000;
                }
            } else {
                precio += 8000;
                if (lujo) {
                    precio += 5000;
                }
            }

        } else {
            precio = precioBase;
        }

        this.setPrecioFinal(precio);
    }
}
