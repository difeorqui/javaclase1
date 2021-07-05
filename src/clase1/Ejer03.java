package clase1;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
*/

public class Ejer03 {
    public static void main(String[] args) {
        final double VALOR_HORA = 30000;
        DecimalFormat formatear = new DecimalFormat("###,###");

        var sc = new Scanner(System.in);
        System.out.print("Nmbre del trabajador: ");
        var nombre = sc.next();
        System.out.print("Total de horas trabajadas en el mes: ");
        var horas = sc.nextInt();
        sc.close();
        var sueldo = Salario(horas, VALOR_HORA);

        // System.out.format("El sueldo de %s por %d horas en el mes es de $%.0f",nombre, horas, sueldo);
        System.out.format("El sueldo de %s por %d horas en el mes es de $%s",nombre, horas, formatear.format(sueldo));
    }

    public static Double Salario(Integer horas, Double valorHora) {
        return horas * valorHora;
    }
}
