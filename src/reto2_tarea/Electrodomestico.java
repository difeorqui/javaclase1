public class Electrodomestico { 
    // Constantes
    final int PESO_BASE = 5;
    final char CONSUMO_W_BASE = 'F';
    final double PRECIO_BASE = 100.0;
    // Atributos
    private int peso;
    private char consumoW;
    private double precioBase;

    public double getPrecioBase() {
        return precioBase;
    }

    // Constructores 
    public Electrodomestico(){ 
        // Código 
        this.precioBase = this.PRECIO_BASE;
        this.consumoW = this.CONSUMO_W_BASE;
        this.peso = this.PESO_BASE;
    } 

    public Electrodomestico(Double precioBase, Integer peso){ 
        // Código 
        this.peso = peso;
        this.precioBase = precioBase;
        this.consumoW = this.CONSUMO_W_BASE;
    }

    public Electrodomestico(Double precioBase, Integer peso, char consumoW){ 
        // Código 
        this.peso = peso;
        this.precioBase = precioBase;
        this.consumoW = consumoW;
        comprobarconsumoW(consumoW); 
    }

    // Metodos 
    public void comprobarconsumoW(char consumoW){ 
        if("ABCDEF".indexOf(consumoW+"") >= 0 ){ 
            this.consumoW = consumoW; 
        } else { 
            this.consumoW = this.CONSUMO_W_BASE; 
        } 
    }

    public Double calcularPrecio(){ 
        // Código 
        double adicion;
        switch (this.consumoW) {
            case 'A':
                adicion = 100.0;
                break;
            case 'B':
                adicion = 80.0;
                break;
            case 'C':
                adicion = 60.0;
                break;
            case 'D':
                adicion = 50.0;
                break;
            case 'E':
                adicion = 30.0;
                break;
            case 'F':
                adicion = 10.0;
                break;
            default:
                adicion = 0.0;
                break;
        }

        if (this.peso >= 0 && this.peso < 19) {
            adicion += 10.0;
        } else if (this.peso >= 19 && this.peso < 49) {
            adicion += 50.0;
        } else if (this.peso >= 49 && this.peso < 80) {
            adicion += 80.0;
        } else if (this.peso > 79 ) {
            adicion += 100;
        }

        return this.precioBase + adicion; 
    } 
}