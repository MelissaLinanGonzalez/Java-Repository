package Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer un archivo línea por línea
 * Desarrolla un programa que lea el archivo 'datos.txt' línea por línea e imprima cada línea por consola*/

public class LeerLineaxLinea {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(datos));

            String linea;
            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
