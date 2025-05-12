package EjerciciosBasicos;

// Leer un archivo CSV y mostrar los datos
// Crea un programa que lea un archivo CSV llamado 'datos.csv' y muestre su contenido en formato tabla

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej12 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.csv");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = lector.readLine()) != null){
                String[] palabras = linea.split(",");
                for (String palabra : palabras){
                    System.out.printf("%-15s", palabra);
                }
                System.out.println();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
