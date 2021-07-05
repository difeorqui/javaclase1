/*
Programa que lea la longitud de los catetos de un triángulo rectángulo y
calcule la longitud de la hipotenusa según el teorema de Pitágoras.
 */
package clase2;
import java.util.Scanner;
public class Ejer05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        System.out.print("Longitud cateto X: ");
        var x = sc.nextFloat();
        System.out.print("Longitud cateto Y: ");
        var y = sc.nextFloat();
        sc.close();

        var h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.format("La hipotenusa es: %.2f", h);
    }

}
