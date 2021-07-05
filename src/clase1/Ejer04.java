package clase1;
import java.util.Scanner;

/*
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos
 */
public class Ejer04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Digita un número: ");
        var numero = sc.nextInt();
        sc.close();
        GenerarTabla(numero);
    }

    public static void GenerarTabla(int numero) {
        System.out.println("\nTabla del " + numero);
        System.out.println("================\n");
        for (int i = 0; i <= 10; i++) {
            System.out.format("%d x %d = %d\n",numero, i, numero * i);
        }
    }
}
