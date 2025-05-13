package Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer un archivo CSV y mostrar los datos
 * Crea un programa que lea un archivo CSV llamdo 'datos.csv' y muestre su contenido en formato tabla*/

public class LeerCSV {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.csv");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(datos));

            String linea;
            while ((linea = lector.readLine()) != null){
                String[]palabras = linea.split(",");
                for (String palabra : palabras){
                    System.out.printf("%-15s" + palabra);
                }
                System.out.println(" ");
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
