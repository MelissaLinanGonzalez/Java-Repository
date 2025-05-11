package EjerciciosBasicos;

// Contar palabras en un archivo
// Crea un programa que cuente el numero total de palabras en el archivo 'datos.txt' y muestre el resultado por pantalla

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej5 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.txt");
        int totalPalabras = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = lector.readLine()) != null){
                String[] palabras = linea.trim().split("\\s+");

                // Si la linea no esta vacia cuenta los espacios
                if (!linea.trim().isEmpty()){
                    totalPalabras += palabras.length;
                }
            }
            System.out.println("Número total de palabras: " + totalPalabras);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
