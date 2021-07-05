package clase1;
/*
Muestra la serie de fibonacci hasta un número pedido por teclado. Por
ejemplo, si el número ingresado es el 100, debe imprimir los números 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
 */
import java.util.Scanner;
public class Ejer10 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);     
        System.out.print("Indica el número de la serie fibonacci a imprimir: ");
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
