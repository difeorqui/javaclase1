package reto1;

/**
 * CalcularInversion
 */
public class EjemploCalcularInversion {

    // Atributos
    private int tiempo;
    private double capital;
    private double interes;

    // Métodos
    // Constructor
    public EjemploCalcularInversion() {
        this.tiempo = 0;
        this.capital = 0.0;
        this.interes = 0.0;
    }

    // Constructor sobrecarga
    public EjemploCalcularInversion(Integer tiempo, Double capital, Double interes) {
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;
    }
    
    public double calcularInteresSimple() {
        double interesSimple = this.capital * (this.interes / 100) * this.tiempo;
        // divide entre 100 porque al ingresar el interés se ingresa como un valor
        // entero, por ejemplo 19% se escribe 19 y la división lo convierte en 0.19
        // Luego se multiplica por el capital para calcularle el interés
        // Luego por el tiempo para calcularlo a lo largo del tiempo.
        return Math.round(interesSimple);
    }
    
    public double calcularInteresCompuesto() {
        double interesCompuesto = this.capital * 
                                  (Math.pow(1 + (this.interes * 100), this.tiempo) - 1);
                                  // Math.pow, elevar un valor a otro, en este caso tiempo
        return Math.round(interesCompuesto);
    }

    public double compararInversion() {
        return calcularInteresCompuesto() - calcularInteresSimple();
    }

    // Otra forma de instaciar la clase
    public double compararInvsersion(Integer tiempo, Double capital, Double interes) {
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;

        return Math.round(compararInversion());
    }

    public double getCapital() {
        return capital;
    }

    public double getInteres() {
        return interes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public static void main(String[] args) {
        EjemploCalcularInversion inversion1 = new EjemploCalcularInversion(); // Llama al constructor
        // Aquí todos los parámetros quedarían en cero.
        System.out.println("Capital: " + inversion1.getCapital());
        System.out.println("Interés: " + inversion1.getInteres());
        System.out.println("Tiempo: " + inversion1.getTiempo());
        
        System.out.println(inversion1.calcularInteresSimple()); 
        System.out.println(inversion1.calcularInteresCompuesto()); 
        System.out.println(inversion1.compararInvsersion(12,2000000.0,5.0));

    }


} // Cierra la clase

