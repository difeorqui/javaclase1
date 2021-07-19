public class Lavadora extends Electrodomestico{ 
    // Constantes y Atributos 
    final int CARGA_BASE = 5;
    private int carga;
    // Constructores 
    public Lavadora(){ 
        // Código 
        super();
        this.carga = this.CARGA_BASE;
    } 
    public Lavadora(Double precioBase, Integer peso){ 
        // Código
        super(precioBase, peso);
        this.carga = this.CARGA_BASE;
    } 
    public Lavadora(Double precioBase, Integer peso, char consumoW, Integer carga){
        // Código 
        super(precioBase, peso, consumoW);
        this.carga = carga;
    } 
    // Métodos 
    @Override
    public Double calcularPrecio(){ 
        // Código 
        double precioFinal = super.calcularPrecio();
        if (this.carga > 30) {
            precioFinal += 50.0;
        }
        return precioFinal;
    } 
}