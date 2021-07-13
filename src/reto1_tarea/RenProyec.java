public class RenProyec {

    private int tiempo;
    private double capital;
    private double interes;

    public RenProyec() {
    }

    public RenProyec(int cTiempo, double cCapital, double cInteres) {
        this.tiempo = cTiempo;
        this.capital = cCapital;
        this.interes = cInteres;
    }

    public double calcularInteresSimple() {
        return Math.round(this.capital * (this.interes / 100.0) * this.tiempo);
    }

    public double calcularInteresCompuesto() {
        return Math.round(this.capital * (Math.pow(1 + (this.interes / 100.0), this.tiempo) - 1));
    }

    public String analisisInversion(int cTiempo, double cCapital, double cInteres) {
        this.tiempo = cTiempo;
        this.capital = cCapital;
        this.interes = cInteres;
        
        return this.analisisInversion();
    }

    public String analisisInversion() {
        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();

        if ( diferencia>0) {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
    }

}