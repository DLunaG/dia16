package tictactoe;

public class TicTacToe {

    char[][] tablero = new char[3][3];
    char jugador = ' ';

    public TicTacToe(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                tablero[i][j] = ' ';
            }

        }

    }

    public void draw(){
        System.out.println("  1  2  3\n" +
                "  -------");
        for(int i = 0; i <tablero.length; i++){
            for (int j = 0; j < tablero.length ; j++) {
                if(j == 0) {
                    System.out.print(i+1 + "|" + tablero[i][j] + " ");
                }else{
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean mark(int fila, int columna, int jugador){
        if(tablero[fila-1][columna-1] != ' '){
            return false;
        }
        if(jugador % 2 == 0){
            tablero[fila-1][columna-1] = 'X';
        }else{
            tablero[fila-1][columna-1] = 'O';
        }

        return true;
    }

    public boolean hasWin(int jugadorActual){
        if(jugadorActual % 2 == 0){
            jugador = 'X';
        }else{
            jugador = 'O';
        }
        if(diagonal(jugador)){
            return true;
        }else if(center(jugador)){
            return true;
        }else if(square(jugador)){
            return true;
        }else{
            return false;
        }
    }

    private boolean diagonal(char jugador){
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }else if(tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }else{
            return false;
        }
    }

    private boolean center(char jugador) {
        if (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) {
            return true;
        }else if(tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) {
            return true;
        }else {
            return false;
        }
    }

    private boolean square(char jugador) {
        if (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) {
            return true;
        } else if (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador){
            return true;
        } else if (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador){
            return true;
        } else if (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }else{
            return false;
        }

    }



}
