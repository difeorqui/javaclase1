/**
 * Programa que pase de pesos a dólares y viceversa.
 */
package clase2;

import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) {
        final double TASA_USD = 3773.00;
        var sc = new Scanner(System.in);
        System.out.print("Digita un valor en pesos COP $ ");
        var pesos = sc.nextInt(); 
        System.out.format("%d pesos equivalen a %.2f dólares.",pesos, pesos / TASA_USD);

        System.out.print("\nDigita un valor en dólares USD $ ");
        var dolares = sc.nextDouble(); 
        System.out.format("%.2f dólares equivalen a %.0f pesos.",dolares, TASA_USD * dolares);

        sc.close();
    }    
}
