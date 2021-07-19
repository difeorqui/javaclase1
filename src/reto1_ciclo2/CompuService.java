public class CompuService {
    public static void main(String[] args) {
        System.out.println("Caso de prueba 1");
        CompararRentabilidad comparar1 = new CompararRentabilidad();
        System.out.println(comparar1.compararRentabilidad(12, 2000000, 5.5));

        System.out.println("Caso de prueba 2");
        CompararRentabilidad comparar2 = new CompararRentabilidad(12, 20000000, 5);
        System.out.println(comparar2.compararRentabilidad());
    }
}
