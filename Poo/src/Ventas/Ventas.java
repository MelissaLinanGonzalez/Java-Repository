package Ventas;


/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 *  - Mostrar la tabla completa de ventas.
 *  - Calcular y mostrar el total de ventas por producto.
 *  - Determinar qué producto tuvo el mayor total de ventas
 *
 */

import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] ventas = new int[3][2];

        for (int i = 0; i < ventas.length; i++) { //importante para recorrer
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("¿Cuántas ventas ha tenido el producto " + (i+1) + " para el día " + (j+1) + "? ");
                ventas [i][j] = entrada.nextInt();
            }
        }

        mostrarVentas(ventas);
        System.out.println();
        mostrarTotalProductos(ventas);
        System.out.println();
        productoConMasVentas(ventas);


    }

    private static void productoConMasVentas(int[][] ventas) {
        int maxVentas = 0;
        int productoMasVendido = 0;
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 2; j++) {
                total += ventas[i][j];
            }
            if (total > maxVentas){
                maxVentas = total;
                productoMasVendido = i + 1;
            }
        }
        System.out.println("El producto que más ventas ha tenido ha sido el producto " + productoMasVendido + " con una cantidad total de " + maxVentas + " ventas");
    }

    private static void mostrarTotalProductos(int[][] ventas) {

        System.out.println("Total de ventas de cada producto");
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 2; j++) {
                total += ventas[i][j];
            }
            System.out.println("Total de ventas del producto " + (i+1) + ": " + total);
        }

    }

    private static void mostrarVentas(int[][] ventas) {
        System.out.println();
        System.out.println("Tabla de ventas");
        System.out.println(" ProductoID  |dia1 |dia2");
        for (int i = 0; i < 3; i++) {
            System.out.println("+------------------------+");
            System.out.print("|Producto " + (i+1) + "  |");
            for (int j = 0; j < 2; j++) {
                System.out.print("  " + ventas[i][j] + "  |");
            }
            System.out.println();
        }
    }
}
