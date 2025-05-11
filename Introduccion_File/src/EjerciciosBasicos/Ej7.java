package EjerciciosBasicos;

// Buscar palabras en un archivo
// Crea un programa que busque una palabra específica dentro del archivo 'datos.txt', y muestre el total

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ej7 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.txt");
        String palabraBuscada = "linea";
        int contador = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = lector.readLine()) != null){
                String[] palabras = linea.trim().split("\\s+");
                for (String palabra : palabras){
                    if (palabra.equals(palabraBuscada)){
                        contador++;
                    }
                }
            }

            System.out.println("La palabra " + palabraBuscada + " fue encontrada " + contador + " veces");

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
