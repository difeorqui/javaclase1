package clase1;
/*
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110
*/

import java.util.Scanner;
public class Ejer06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var genero = "";
        do {
            System.out.print("¿Cuál es tu género? (H)ombre o (M)ujer: ");
            genero = sc.nextLine().charAt(0) + "";
        } while (!genero.equalsIgnoreCase("h") && !genero.equalsIgnoreCase("m"));

        System.out.print("Digita tu altura en centímetros (cm): ");
        var altura = sc.nextInt();
        sc.close();

        var pesoIdeal = PesoIdeal(genero, altura);
        System.out.print("Tu peso ideal es " + pesoIdeal + " kilos.");
    }

    private static Integer PesoIdeal(String genero, int altura) {
        if (genero.equalsIgnoreCase("h")) {
            return altura - 120;
        } else {
            return altura - 110;
        }
    }
    
    
}
