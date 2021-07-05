/*
Programa que lea un número entero y muestre si el número es
múltiplo de 10.
 */
package clase2;
import java.util.Scanner;
public class Ejer07 {
    public static void main(String[] args) {
        final String LETRAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        var sc = new Scanner(System.in);        
        System.out.print("Digita una letra: ");
        try {
            var x = sc.next().charAt(0) + "";
            if (LETRAS.indexOf(x.toUpperCase()) > 0) {
                if (x.equals(x.toUpperCase())) {
                    System.out.print("Es una letra mayúscula");
                } else {
                    System.out.print("NO es una letra mayúscula");    
                }
            } else {
                System.out.print("NO es una letra mayúscula");    
            }
        } catch (Exception e) {
            System.out.print("NO es una letra mayúscula");    
        }
        sc.close();
    }
}
