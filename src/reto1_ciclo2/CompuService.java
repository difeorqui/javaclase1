public class CompuService {
    public static void main(String[] args) {
        System.out.println("Caso de prueba 1");
        CompararRentabilidadCasos comparar1 = new CompararRentabilidadCasos();
        System.out.println(comparar1.compararRentabilidad(12, 2000000, 5.5));

        System.out.println("Caso de prueba 2");
        CompararRentabilidadCasos comparar2 = new CompararRentabilidadCasos(12, 20000000, 5);
        System.out.println(comparar2.compararRentabilidad());
    }
}
