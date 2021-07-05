/*
Programa que lea dos variables un texto de N caracteres y un número  m y le quite a N sus m últimas
cifras.
Por ejemplo, si N = Casita y m = 2 el nuevo valor de N será Casi
 */
package clase2;
import java.util.Scanner;
public class Ejer031 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        var n = "";
        var m = 0;
        do {
            LimpiarPantalla();
            System.out.print("Digita una cadena de texto: ");
            n = sc.nextLine();
            System.out.print("¿cuántas cifras desea eliminar del final?: ");
            m = sc.nextInt();
        } while (m > n.length());
        sc.close();

        n = n.substring(0, n.length()-m);
        System.out.print("Nueva texto: "+n);
    }

    /**
     *  Código extraído de:
     *  https://www.delftstack.com/es/howto/java/java-clear-console/#:~:text=Usar%20c%C3%B3digos%20de%20escape%20ANSI%20para%20limpiar%20la%20consola%20en%20Java,-Podemos%20usar%20c%C3%B3digos&text=Para%20limpiar%20la%20consola%20en%20Java%2C%20usaremos%20el%20c%C3%B3digo%20de,comando%20para%20limpiar%20la%20consola.
     */
    private static void LimpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
