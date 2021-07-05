package clase2;

/*
 Programa que pida por teclado la fecha de nacimiento de una persona
(día, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha
de nacimiento y a continuación sumando las cifras obtenidas en la suma
 */

import java.util.Scanner;
 public class Ejer01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Digita tu fcha de nacimiento en formato DD/MM/AAAA: ");
        var fecha = sc.nextLine();
        sc.close();
        
        var numeroSuerte = CalcularNumeroSuerte(fecha);
        System.out.print("Tu número de la suerte es el: " + numeroSuerte);
    }

    private static int CalcularNumeroSuerte(String fecha) {
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anio = Integer.parseInt(fecha.substring(6,10));
        int suma = dia + mes + anio; 
        int resultado = 0;

        while (suma != 0) {
            resultado += suma%10;
            suma /= 10;
        }

        return resultado;
    }    
}
