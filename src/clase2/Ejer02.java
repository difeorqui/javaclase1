/*
Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
 */
package clase2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejer02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        var formatear = new DecimalFormat("###,###.##");
        char opcion;
        var valorProductoSinIva = 0.0;
        var unidades = 0;
        var iva = 0.0;
        var neto = 0.0;
        var totalIva = 0.0;
        var totalPago = 0.0;

        do {
            System.out.print("Valor del producto sin IVA: ");
            valorProductoSinIva = sc.nextFloat();
            System.out.print("Valor IVA: ");
            iva = sc.nextFloat();
            System.out.print("Cantidad: ");
            unidades = sc.nextInt();
            
            neto = valorProductoSinIva * unidades;
            totalIva = neto * iva / 100;
            totalPago = neto + totalIva;

            System.out.println(String.format("%0100d", 0).replace("0", "="));
            System.out.println("Total Iva: $" + formatear.format(totalIva));
            System.out.println("Precio de venta: $" + formatear.format(totalPago));

            System.out.print("\n¿Ingresar más productos? S/N: ");
            try {
                opcion = sc.next().toLowerCase().charAt(0);    
            } catch (Exception e) {
                // Si se genera un error se termina el proceso
                opcion = 'n';
            }
            LimpiarPantalla();
        } while (opcion =='s');
        sc.close();
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
