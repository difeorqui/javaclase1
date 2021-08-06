import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Crea una aplicación donde pidamos la ruta de un fichero por teclado y un
 * texto que queramos a escribir en el fichero. Deberás mostrar por pantalla el
 * mismo texto pero variando entre mayúsculas y minúsculas, es decir, si escribo
 * “Bienvenido” deberá devolver “bIENVENIDO”. Si se escribe cualquier otro
 * carácter, se quedará tal y como se escribió. Deberás crear un método para
 * escribir en el fichero el texto introducido y otro para mostrar el contenido
 * en mayúsculas.
 */

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita la ruta del archivo: ");
        var ruta = sc.nextLine();
        System.out.print("Digita el texto que desees: ");
        var texto = sc.nextLine();
        sc.close();
        
        String nuevoTexto = convertir(texto);
        System.out.println("Texto modificado: "+nuevoTexto);
        escribirTexto(ruta, texto);
    }

    private static String convertir(String texto) {
        var nuevoTexto = "";
        int ascii;
        char letra;
        for (int i = 0; i < texto.length(); i++) {
            ascii = texto.charAt(i);
            if (ascii >= 65 && ascii <= 90){
                letra = (char)(ascii + 32);
            } else if (ascii >= 97 && ascii <= 122){
                letra = (char)(ascii - 32);
            } else {
                letra = (char)(ascii); 
            }
            nuevoTexto += letra+"";
        }
        return nuevoTexto;
    }



    private static void escribirTexto(String ruta, String texto) {
        var archivo = ruta+"\\ejercicio42.txt";
        try {
            var salida = new PrintWriter(archivo);   
            salida.println(texto); 
            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

}
