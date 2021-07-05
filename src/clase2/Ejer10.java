/*
El programa lee por teclado tres números enteros y calcula y
muestra el mayor de los tres.
 */
package clase2;
import java.util.Scanner;
public class Ejer10 {
    public static void main(String[] args) {
        final String ERROR = "La hora no es válida";
        final String VALIDA = "La hora es válida";

        var sc = new Scanner(System.in);        
        System.out.print("Digita la Hora: ");
        var h = sc.nextInt();
        System.out.print("Digita los Minutos: ");
        var m = sc.nextInt();
        System.out.print("Digita los Segundos: ");
        var s = sc.nextInt();
        sc.close();

        var esValido = false;
        esValido = ValidarHora(h, m, s);
        if (esValido) {
            System.out.format("%d:%d:%d - %s", h, m , s, VALIDA);
        } else {
            System.out.format("%d:%d:%d - %s", h, m , s, ERROR);
        }

    }

    private static boolean ValidarHora(int h, int m, int s) {
        final int MAX24 = 24;
        final int MAX60 = 60;

        return (h >= 0 && h < MAX24 && m >= 0 && m < MAX60 && s >= 0 && s < MAX60);
    }
}
