import java.util.Scanner;

public class BusquedaTesoroCorreccion {
    public static void main(String[] args) {
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x,y;
        int [][] cuadrante = new int[5][4];
        Scanner entrada = new Scanner(System.in);

        //Inicializa el array
        for (x= 0; x < 5; x++){
            for (y =  0; y < 4; y++){
                cuadrante[x][y] = VACIO;
            }
        }
        //COLOCAR LA MINA
        int minaX = (int) (Math.random()*5);
        int minaY = (int) (Math.random()*4);
        cuadrante[minaX][minaY] = MINA;

        //colocar el tesoro
        int tesoroX, tesoroY;

        do { // ejecuta el bloque de código al menos una vez y luego evalúa la condición para decidir si debe repetir el bucle
            tesoroX = (int) (Math.random()*5);
            tesoroY = (int) (Math.random()*4);
        } while ((minaX == tesoroX) && (minaY == tesoroY)); //SI el tesoroX y el tesoroY generados no coinciden con minaX y minaY, el bucle se detiene.
        cuadrante[tesoroX][tesoroY] = TESORO;

        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c;


    }
}
