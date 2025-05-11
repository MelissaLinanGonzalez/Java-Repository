package EjerciciosBasicos;

// Leer un archivo linea por linea
// Desarrolla un programa que lea el archivo 'datos.txt' linea por linea e imprima cada linea por pantall

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.txt");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }

            lector.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
