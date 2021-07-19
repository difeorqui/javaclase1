public class CompararRentabilidad {
    // ---------------------------------------------
    // Atributos
    // ---------------------------------------------
    int tiempo;
    int valorProducto;
    double interes;

    // ---------------------------------------------
    // Métodos
    // ---------------------------------------------

    // Constructor
    public CompararRentabilidad() {
        this.tiempo = 0;
        this.valorProducto = 0;
        this.interes = 0.0;
    }
    
    public CompararRentabilidad(int pTiempo, int pValorProducto, double pInteres ) {
        this.tiempo = pTiempo;
        this.valorProducto = pValorProducto;
        this.interes = pInteres;
    }

    public int calcularInteresSimple() {
        int interesSimple = (int) Math.round(this.valorProducto * (this.interes / 100.0) * this.tiempo);
        System.out.println(interesSimple);
        return interesSimple;
    }

    public int calcularInteresCompuesto() {
        int interesCompuesto = (int) Math.round(this.valorProducto * (Math.pow(1 + (this.interes / 100.0), this.tiempo) - 1));
        System.out.println(interesCompuesto);
        return interesCompuesto;
    }

    public String compararRentabilidad () {
        int diferencia = (calcularInteresCompuesto() - calcularInteresSimple());
        if(diferencia > 0){
            return "La diferencia en el total de intereses generados para el crédito, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el crédito.";
        }
    }

    public String compararRentabilidad ( int pTiempo, int pValorProducto, double pInteres ) {
        this.tiempo = pTiempo;
        this.valorProducto = pValorProducto;
        this.interes = pInteres;
        return this.compararRentabilidad();
    }
}
