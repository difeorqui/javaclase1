package clase1;
/*
Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.
*/

import java.util.Scanner;
public class Ejer08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);        
        char opcion, jugada1, jugada2;
        System.out.print("--------- Juego de Piedra, Papel o Tijera ---------\n");
        System.out.print("Primer jugador: ");
        var jugador1 = sc.nextLine();
        System.out.print("Segundo jugador: ");
        var jugador2 = sc.nextLine();
        var ganador = 0;

        do {
            System.out.format("%s: (P) piedra, (L) papel o (T) tijera: ", jugador1);
            jugada1 = sc.next().toLowerCase().charAt(0);
            
            System.out.format("%s: (P) piedra, (L) papel o (T) tijera: ", jugador2);
            jugada2 = sc.next().toLowerCase().charAt(0);

            ganador = ValidarPartida(jugada1, jugada2);
            if (ganador == 1) {
                System.out.format("\nEl gandaro es %s", jugador1);
            } else if (ganador == 2) {
                System.out.format("\nEl gandaro es %s", jugador2);
            } else {
                System.out.format("¡¡¡ Empate !!!");
            }

            System.out.print("\n¿Iniciar nueva partida? S/N: ");
            opcion = sc.next().toLowerCase().charAt(0);
        } while (opcion =='s');

        sc.close();
    }

    private static int ValidarPartida(char jugada1, char jugada2) {
        var piedra = 'p';
        var papel = 'l';
        var tijera = 't';

        if (jugada1 == jugada2) { 
            return 0; // Empate
        }

        if (jugada1 == piedra && jugada2 == tijera) { 
            System.out.format("Piedra rompre Tijera");
            return 1; // Ganador jugador 1
        } else if (jugada1 == papel && jugada2 == piedra) {
            System.out.format("Papel cubre Piedra");
            return 1; // Ganador jugador 1
        } else if (jugada1 == tijera && jugada2 == papel) {
            System.out.format("Tijera corta Papel ");
            return 1; // Ganador jugador 1
        } else if (jugada2 == piedra && jugada1 == tijera) { 
            System.out.format("Piedra rompre Tijera");
            return 2; // Ganador jugador 1
        } else if (jugada2 == papel && jugada1 == piedra) {
            System.out.format("Papel cubre Piedra");
            return 2; // Ganador jugador 1
        } else if (jugada2 == tijera && jugada1 == papel) {
            System.out.format("Tijera corta Papel ");
            return 2; // Ganador jugador 1
        }

        return 0;
    }    
}
