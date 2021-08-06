/**
 * Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una
aplicación que lea este fichero de texto carácter a carácter y muestre su contenido por
pantalla sin espacios. Por ejemplo, si un fichero tiene el siguiente texto “Esto es una
prueba”, deberá mostrar “Estoesunaprueba”.
Captura las excepciones que veas necesario.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercio4_1 {
    public static void main(String[] args) {
        var nombre = "C:\\SALVAVIDAS\\OneDrive - Eficacia\\Mis documentos\\EFICACIA\\DOROZCO\\MIN TIC 2022\\Ciclo 2\\Programación\\Ejercicios\\Ejercicios\\src\\Unidad 4\\ejercio4.txt";

        try {
            File myObj = new File(nombre);
            Scanner myReader = new Scanner(myObj);
            myReader.useDelimiter("");
            while (myReader.hasNext()) {
                String data = myReader.next();
                if(!data.isBlank())
                    System.out.print(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }

    }
}