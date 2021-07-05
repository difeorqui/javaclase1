package clase2;
/*
Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
 */
import java.util.Scanner;
public class Ejer15 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);     
        System.out.print("Digita N: ");
        var numero = sc.nextInt();
        sc.close();
        double suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma += Factorial(i);
        }
        System.out.format("(RECURSIVO) La suma de los factoriales de los números desde 0 hasta %d es %.0f", numero, suma);

    }
    // Esta función es recursiva ya que se llama a sí misma
    private static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

}
