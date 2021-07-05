package clase1;
/*
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar.
*/
import java.util.Scanner;

public class Ejer07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var numero = 0;
        var aux = 0;
        var esPrimo = false;
        char opcion;
        do {
            System.out.print("Digita un número: ");
            aux = sc.nextInt();
            numero = Math.abs(aux);
            esPrimo = ValidarPrimo(numero);
            if (esPrimo) {
                System.out.format("%d es Primo", aux);    
            } else {
                System.out.format("%d no es Primo", aux);    
            }

            System.out.print("\n¿Ingresar otro valor? S/N: ");
            opcion = sc.next().toLowerCase().charAt(0);
        } while (opcion =='s');

        sc.close();
    }

    private static boolean ValidarPrimo(int numero) {
        // Sólo los mayores a 1 se evaluan si son primos
        if (numero < 2) {
            return false;
        }
        var esPrimo = true;
        // Es primo si es divisible por 1 y por sí mismo
        var raiz = (int)Math.sqrt(numero);
        for (int i = 2; i <= raiz; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
