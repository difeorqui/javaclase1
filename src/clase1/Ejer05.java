package clase1;
/*
Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio
 */
import java.util.Scanner;
 public class Ejer05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var aleatorio = (int)(Math.random() * 100 + 1);
        var adivinaste = false;
        var numero = 0;
        var intentos = 0;

        do {
            System.out.print("Digita un número:");
            numero = sc.nextInt();

            adivinaste = Validar(numero, aleatorio);
            intentos++;
        } while (!adivinaste);
        sc.close();
        System.out.println("Aleatorio: "+aleatorio+"\nTotal de intentos: " + intentos);
    }

    private static boolean Validar(int numero, int aleatorio) {
        var adivinaste = false;
        if (numero < aleatorio) {
            System.out.println("El número que busca es mayor");
        } else if (numero > aleatorio){
            System.out.println("El número que busca es menor");
        } else {
            System.out.println("Adivinaste !!!!!!");
            adivinaste = true;
        }

        return adivinaste;
    }
}
