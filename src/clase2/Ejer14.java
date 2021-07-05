package clase2;
/*
Mostrar los N primeros términos de la serie de Fibonacci
 */
import java.util.Scanner;
public class Ejer14 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);     
        System.out.print("N primeros términos de la serie fibonacci a imprimir: ");
        var numero = sc.nextInt();
        Fibonacci(numero);
        sc.close();
    }

    private static void Fibonacci(int numero) {
        var num1 = 0;
        var num2 = 1;
        var valores = "0 1";

        if (numero == 1) {
            System.out.print("0");
            return;
        }
        var aux = 0;
        for (int i = 3; i <= numero; i++) {
            aux = num1 + num2;
            valores += " "+(aux);
            num1 = num2;
            num2 = aux;
        }
        System.out.print(valores);
    }
}
