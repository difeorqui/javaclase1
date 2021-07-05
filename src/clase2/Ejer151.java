package clase2;
/*
Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
 */
import java.util.Scanner;
public class Ejer151 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);     
        System.out.print("Digita N: ");
        var numero = sc.nextInt();
        sc.close();
        double suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma += Factorial(i);
        }
        System.out.format("(CICLO FOR) La suma de los factoriales de los números desde 0 hasta %d es %.0f", numero, suma);

    }

    private static int Factorial(int n) {
        var fact = 1;
        if (n==0) return fact;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
