package Prueba_7_11;
/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria. El ancho de la tableta se pide por teclado. El bocado se da alrededor del turrón, obviamente no se puede dar un bocado en medio de la tableta
 * ****
 * ***
 * ****  */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la anchura del turrón: ");
        int ancho = sc.nextInt();
        System.out.print("Introduce la altura del turrón: ");
        int altura = sc.nextInt();
        int n_aleatorio = 0;
        int n_aleatorio2 = 0;

        n_aleatorio = (int) (Math.random() * altura + 1);
        n_aleatorio2 = (int) (Math.random() * ancho + 1);
        System.out.println(n_aleatorio);
        System.out.println(n_aleatorio2);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for (int m = 0; m < altura; m++) {
            for (int n = 0; n < ancho; n++) {
                if (m ==(n_aleatorio-1) && n == (n_aleatorio2-1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}


/*Escribe un programa que genere 20 números aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. utiliza arrays auxiliares si es necesario*/
