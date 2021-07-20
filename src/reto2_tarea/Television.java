public class Television extends Electrodomestico{ 
    // Constantes y Atributos 
    final int PULGADAS_BASE = 20;
    final boolean SINTONIZADOR_TDT = false;
    private int pulgadas;
    private boolean sintonizadorTDT;

    // Constructores 
    public Television(){ 
        // Código 
        super();
        this.pulgadas = this.PULGADAS_BASE;
        this.sintonizadorTDT = this.SINTONIZADOR_TDT;
    } 
    public Television(Double precioBase, Integer peso){ 
        // Código
        super(precioBase, peso); 
        this.pulgadas = this.PULGADAS_BASE;
        this.sintonizadorTDT = this.SINTONIZADOR_TDT;
    } 
    public Television(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintetizadorTDT){ 
        // Código 
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintetizadorTDT;
    } 
    // Métodos 
    @Override
    public Double calcularPrecio(){ 
        // Código 
        double adicion = 0.0;
        if (this.sintonizadorTDT) {
            adicion += 50.0;
        }
        if (this.pulgadas > 40) {
            adicion += (super.getPrecioBase() * 0.3);
        }
        return super.calcularPrecio() + adicion;
    } 
} 
// Fin de la solución