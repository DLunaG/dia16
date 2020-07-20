package tictactoe;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean power = true;
        boolean antiBorrado = false; //para evitar repetir casilla

        int turno = 1;
        int jugador = 0;
        int fila = -1;
        int columna = -1;

        TicTacToe partida = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al 3 en raya!");
        partida.draw();
        while(power){
            System.out.println("Turno " + turno + ".Jugador " + (jugador%2+1) + ":\n" +
                    "indica la fila -> ");
            fila = sc.nextInt();
            System.out.println("indica la columna -> ");
            columna = sc.nextInt();
            antiBorrado = partida.mark(fila, columna, jugador);

            if(!antiBorrado){
                System.out.println("Casilla ocupada, introduce otra.");
            }else {
                partida.draw();
                turno++;
                if(turno > 4) {
                    power = !partida.hasWin(jugador);
                }
                jugador++;
            }
        }
        jugador--;
        System.out.println("Ganador: jugador " + (jugador%2)+1);
    }
}
