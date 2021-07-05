/*
Programa que pase una velocidad en Km/h a m/s. 
La velocidad se lee por teclado
 */
package clase2;
import java.util.Scanner;
public class Ejer04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        System.out.print("Velocidad en kilómetros: ");
        var velocidadKm = sc.nextFloat();
        sc.close();

        System.out.format("%.0f Km/h equivalen a %.3f m/s.", velocidadKm, velocidadKm * 1000 / 3600);
    }

}
