package clase2;
/*
Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E.
 */
public class Ejer17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // if (i==3) {
            //     System.out.println("E");    
            // } else {
            //     System.out.println(i);    
            // }
            System.out.println(i == 3 ? "E" : i);
        }
    }
}
