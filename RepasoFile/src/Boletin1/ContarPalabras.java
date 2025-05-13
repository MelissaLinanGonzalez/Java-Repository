package Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Contar palabras en un archivo
 * Crea un programa que cuente el número total de palabras en el archivo 'datos.txt' y muestre el resultado por pantalla
 * */
public class ContarPalabras {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");

        try {
            int palabras = 0;
            BufferedReader lector = new BufferedReader(new FileReader(datos));

            String linea;
            while ((linea = lector.readLine()) != null){
                String[] pal = linea.trim().split("\\s");

                if (!linea.trim().isEmpty()){
                    palabras += pal.length;
                }
            }
            System.out.println("Total palabras: " + palabras);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
