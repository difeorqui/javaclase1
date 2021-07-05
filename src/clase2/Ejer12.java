 /*
 Realizar programa que muestre los números del 1 al 100 que no
sean múltiplos de 3, utilizando cada una las instrucciones
repetitivas (while, do while, for)
 */

package clase2;

public class Ejer12 {
    public static void main(String[] args) {
        System.out.println(String.format("%050d", 0).replace("0", "="));
        System.out.println("------ Números del 1 al 100 por método While ------");
        While100();
        System.out.println(String.format("%050d", 0).replace("0", "="));
        System.out.println("------ Números del 1 al 100 por método Do While ------");
        DoWhile100();
        System.out.println(String.format("%050d", 0).replace("0", "="));
        System.out.println("------ Números del 1 al 100 por método For ------");
        For100();
    }

    private static void While100() {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void DoWhile100() {
        int i = 0;
        do {
            i++;
            System.out.print(i + " ");
        } while (i < 100);
        System.out.println();
    }

    private static void For100() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
