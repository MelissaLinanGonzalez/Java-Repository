package Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Buscar una palabra en un archivo
 * Escribe un programa que busque una palabra específica dentro del archivo 'datos.txt' e indique cuántas veces aparece
 * */

public class BuscarPalabra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la palabra a buscar en el archivo 'datos.txt': ");
        String palabra = entrada.nextLine();

        File datos = new File("RepasoFile/src/datos.txt");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(datos));
            String linea;
            int contador = 0;
            while ((linea = lector.readLine()) != null){
                String[] palabras = linea.trim().split("\\s");
                for (String pa : palabras){
                    if (pa.equals(palabra)){
                        contador++;
                    }
                }
            }
            lector.close();

            System.out.println("La palabra: " + palabra + " aparece " + contador + " veces");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
