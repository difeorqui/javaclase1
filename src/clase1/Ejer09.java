package clase1;
/*
Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejer09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);     
        System.out.print("Nombre: ");
        var nombre = sc.nextLine();
        System.out.print("Edad: ");
        var edad = sc.nextInt();
        System.out.print("Salario: ");
        var salario = sc.nextDouble();
        Validar(nombre, edad, salario);
        sc.close();
    }

    private static void Validar(String nombre, int edad, double salario) {
        var formatear = new DecimalFormat("###,###");
        var incremento = 0.0;
        var mensaje = "%s, tu salario $%s tiene un incremento del %.0f%%, para un total de $%s";

        if (edad < 16) {
            mensaje = "%s, no tienes edad para trabajar";
            System.out.format(mensaje, nombre);
            return;
        } else if (edad >= 19 && edad <= 50) {
            incremento = 0.05;
        } else if (edad >= 51 && edad <= 60) {
            incremento = 0.1;
        } else if (edad > 60) {
            incremento = 0.15;
        }
        var nuevoSalario = salario * (1.0 + incremento);
        System.out.format(mensaje, nombre, formatear.format(salario), incremento * 100, formatear.format(nuevoSalario));

    }
}
