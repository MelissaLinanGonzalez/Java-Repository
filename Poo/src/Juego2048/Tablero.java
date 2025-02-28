package Juego2048;

public class Tablero {
    private int[][] tablero;
    private final int fil = 4;
    private final int col = 4;

    public Tablero(){
        tablero = new int[fil][col];
    }

    public void imprimirTablero(){
        for (int i = 0; i < fil; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Tablero t = new Tablero();
        t.imprimirTablero();
    }
}
