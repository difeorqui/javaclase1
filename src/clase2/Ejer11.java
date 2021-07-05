 /*
Programa que lea una variable enterames y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28.
Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor
introducido esté comprendido entre 1 y 12
 */

package clase2;
import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        var mes = 0;
        do {
            LimpiarPantalla();
            System.out.print("Digita un mes entre 1 y 12: ");
            mes = sc.nextInt();
        } while (mes <= 0 || mes > 12);
        sc.close();

        ValidarMes(mes);

    }


    private static void ValidarMes(int mes) {
        String[] nombres = new String[]{ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }; 
        int[] dias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.format("El mes %d es %s y tiene %d días", mes, nombres[mes-1], dias[mes-1]);
    }


    /**
     *  Código extraído de:
     *  https://www.delftstack.com/es/howto/java/java-clear-console/#:~:text=Usar%20c%C3%B3digos%20de%20escape%20ANSI%20para%20limpiar%20la%20consola%20en%20Java,-Podemos%20usar%20c%C3%B3digos&text=Para%20limpiar%20la%20consola%20en%20Java%2C%20usaremos%20el%20c%C3%B3digo%20de,comando%20para%20limpiar%20la%20consola.
     */
    private static void LimpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
