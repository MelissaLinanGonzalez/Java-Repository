package EjerciciosBasicos;

// Contar la cantidad de líneas en un archivo
// Crea un programa que cuente cuántas líneas tiene el archivo 'datos.txt' y muestre el total

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej8 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.txt");
        int contadorLineas = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = lector.readLine()) != null){
                contadorLineas++;
            }
            System.out.println("Numero total de lineas en el archivo " + archivo.getName() + ": " + contadorLineas);
            lector.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
