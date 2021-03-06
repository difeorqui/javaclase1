public class RenProyecTest {
    public static void main(String[] args) {
        System.out.println("Caso de prueba 1");
        RenProyec Analisis1 = new RenProyec(2, 50000000.0, 6.2);
        System.out.println(Analisis1.calcularInteresSimple());
        System.out.println(Analisis1.calcularInteresCompuesto());
        System.out.println(Analisis1.analisisInversion());
        
        System.out.println("Caso de prueba 2");
        RenProyec Analisis2 = new RenProyec();
        System.out.println(Analisis2.calcularInteresSimple());
        System.out.println(Analisis2.calcularInteresCompuesto());
        System.out.println(Analisis2.analisisInversion(2, 50000000.0, 6.2));

        System.out.println("Caso de prueba 3");
        RenProyec Analisis3 = new RenProyec(3, 15000000.0, 0.0);
        System.out.println(Analisis3.calcularInteresSimple());
        System.out.println(Analisis3.calcularInteresCompuesto());
        System.out.println(Analisis3.analisisInversion());
    }
}
