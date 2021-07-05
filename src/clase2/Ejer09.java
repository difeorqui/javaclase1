/*
El programa lee por teclado tres números enteros y calcula y
muestra el mayor de los tres.
 */
package clase2;
import java.util.Scanner;
public class Ejer09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        System.out.print("Digita X: ");
        var x = sc.nextInt();
        System.out.print("Digita Y: ");
        var y = sc.nextInt();
        System.out.print("Digita Z: ");
        var z = sc.nextInt();
        sc.close();

        var mayor = 0;
        if (x == y && x == z) {
            mayor = 0;
        } else {
            if (x >= y && x >= z) {
                mayor = x;
            } else if (y >= x && y >= z) {
                mayor = y;
            } else if (z >= x && z >= y) {
                mayor = z;
            }
        }

        if (mayor == 0) {
            System.out.println("Todos los valores son iguales.");
        } else {
            System.out.println("El número mayor es: " + mayor);
        }

    }
}
