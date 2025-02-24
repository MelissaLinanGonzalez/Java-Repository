/* Minijuego: Busca el tesero
* Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de 4 filas por 5 columnas. El usuario intentará averiguar dónde está el tesoro*/
import java.util.Random;
import java.util.Scanner;

public class BusquedaDelTesoro {
    public static void main(String[] args) {
        int [][] cuadrante = new int[4][5];

        Random random = new Random();
        int n1 = random.nextInt(4);
        int n2 = random.nextInt(5);
        int n3 = random.nextInt(4);
        int n4 = random.nextInt(5);

        cuadrante[n1][n2] = 1;
        cuadrante[n3][n4] = 2;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la fila en la que creas que está el tesoro del 0 al 3: ");
        int nf = entrada.nextInt();
        System.out.print("Introduce la columna en la que creas que está el tesoro del 0 al 4: ");
        int nc = entrada.nextInt();

        if (nf >= 0 && nf <= 3 && nc >= 0 && nc <= 4) {
            if (nf == n3 && nc == n4) {
                System.out.println("¡FELICIDADES, HAS ENCONTRADO EL TESORO!");
            } else if (nf == n1 && nc == n2) {
                System.out.println("¡BOOOOOOOOM! HAS DADO CON LA BOMBA");
            } else {
                System.out.println("NO HAY NADA");
            }
        } else {
            System.out.println("Coordenadas fuera de rango");
        }

        int fila, columna;
        for (fila = 0; fila <4 ; fila++) {
            System.out.println();
            for (columna = 0; columna < 5; columna++) {
                System.out.printf(" %1d ",cuadrante[fila][columna]);
            }
        }
        System.out.println();

    }
}
