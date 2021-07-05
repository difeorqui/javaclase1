package clase1;
import java.util.Scanner;

/*
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.
*/

public class Ejer02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        var nombre = sc.next();
        System.out.print("Nota evaluación No.1: ");
        var nota1 = sc.nextDouble();
        System.out.print("Nota evaluación No.2: ");
        var nota2 = sc.nextDouble();
        System.out.print("Nota evaluación No.3: ");
        var nota3 = sc.nextDouble();
        sc.close();

        var promedio = Promedio(nota1, nota2, nota3);
        var estado = "";

        if (promedio >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

        System.out.format("Estudiante %s ha %s con un promedio de %.2f",nombre, estado, promedio);

    }

    public static Double Promedio(Double nota1, Double nota2, Double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}
