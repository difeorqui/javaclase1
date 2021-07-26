public class Moto extends Vehiculo {
    public Moto(double precioBase, boolean lujo, String marca, int modelo) {
        super(precioBase, lujo, marca, modelo, 2);
        calcularPrecio();
    }

    public Moto(double precioBase, boolean lujo, String marca, int modelo, int nroLlantas) {
        super(precioBase, lujo, marca, modelo, nroLlantas);
        calcularPrecio();
    }

    public Moto(double precioBase, boolean lujo, String marca, int modelo, String rin1, String rin2) {
        super(precioBase, lujo, marca, modelo, 2);
        calcularPrecio();
    }

    public void calcularPrecio() {
        double precioBase = this.getPrecioBase();
        boolean lujo = this.getLujo();
        String marca = this.getMarca();
        int modelo = this.getModelo();
        double precio = 0.0;

        // Calculos
        if(marca.equalsIgnoreCase("yamaha")) {
            precio = 5000.0;
            if (modelo > 2012) {
                precio += 2000.0;
                if (lujo) {
                    precio += 5000.0;
                }
            } else {
                precio += 1000;
                if (lujo) {
                    precio += 2000;
                }
            }
        } else if(marca.equalsIgnoreCase("suzuki")) {
            precio = 3000.0;
            if (modelo > 2012) {
                precio += 1000;
                if (lujo) {
                    precio += 3000;
                }
            } else {
                precio += 700;
                if (lujo) {
                    precio += 1000;
                }
            }

        } else {
            precio = precioBase;
        }

        this.setPrecioFinal(precio);
    }
}
