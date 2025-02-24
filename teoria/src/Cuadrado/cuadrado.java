package Cuadrado;
import java.util.Scanner;

/**
 * The type Cuadrado.
 */
public class cuadrado {

    private int lado1;

    /**
     * Pinta.
     *
     * @param lado1 the lado 1
     */
    public void Pinta(int lado1){
        int lado = lado1;
        for (int i = 0; i < lado; i++) {
            System.out.println("");
            for (int j = 0; j < lado; j++) {
                if (i>0 && i<lado-1){
                    if(j==0 || j == lado-1){
                        System.out.print("*  ");
                    }else {
                        System.out.print("   ");
                    }
                } else {
                    System.out.print("*  ");
                }


            }
        }
    }
    // Qué pasa si quiero pintar información de un objeto por pantalla?
    public String toStringo(int lado1){
        int i, espacios;         // Variables de iteración por filas y columnas
        String resultado = "";   // Variable de tipo texto que acumula la representación visual del cuadrado

        for (int j = 0; j < lado1; j++) {
            resultado += "* ";
        }
        resultado += "\n";
        for (int j = 1; j < lado1; j++) {
            resultado += "* ";
        }
        return resultado;
    }

    /*public void pintarArray(int lado1){
        int [][] cuadro = new int[lado1][lado1];

        int fila, columna;
        for (fila = 0, fila < lado1; fila++){
            System.out.println("*");
        }
    }*/

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el tamaño del lado del cuadrado: ");
        int lado1 = entrada.nextInt();
        cuadrado cuadrado1 = new cuadrado();
        cuadrado1.Pinta(lado1);
        cuadrado1.toStringo(lado1);
        System.out.println();
    }
}
