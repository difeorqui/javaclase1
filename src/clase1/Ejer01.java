package clase1;

import java.util.Scanner;
/*
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.
*/

public class Ejer01 {
    public static void main(String[] args) throws Exception {
        // recibe datos por teclado
        var sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        var num1 = sc.nextInt(); // Recibe un entero
        System.out.print("Introduce el segundo número: ");
        var num2 = sc.nextInt(); // Recibe un entero
        sc.close();

        var resultado = Suma(num1, num2);
        System.out.println("\nLa suma de " + num1 + " + " + num2 + " es " + resultado);
        resultado = Resta(num1, num2);
        System.out.println("La resta de " + num1 + " - " + num2 + " es " + resultado);
        resultado = Multiplicacion(num1, num2);
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " es " + resultado);
        resultado = Division(num1, num2);
        System.out.println("La división de " + num1 + " / " + num2 + " es " + resultado);
        resultado = Residuo(num1, num2);
        System.out.println("EL residuo entre " + num1 + " y " + num2 + " es " + resultado);
    }

    // función estática
    public static Integer Suma(int num1, int num2) {
        return num1 + num2;
    }
    public static Integer Resta(int num1, int num2) {
        return num1 - num2;
    }
    public static Integer Multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    public static Integer Division(int num1, int num2) {
        return num1 / num2;
    }
    public static Integer Residuo(int num1, int num2) {
        return num1 % num2;
    }
}
