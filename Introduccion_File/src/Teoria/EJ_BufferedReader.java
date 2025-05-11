package Teoria;// Crea un metodo que reciba un archivo y devuelva la cantidad de palabras de dicho archivo. Utiliza un buffer para realizar la lectura de forma mas eficiente

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EJ_BufferedReader {
    public static void contarPalabras(String nombreArchivo){
        try {
            int palabras = 0;
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null){
                String[] palabrasLinea = linea.split("\\s+");
                palabras += palabrasLinea.length;
            }

            br.close();
            System.out.println(nombreArchivo + " tiene " + palabras + " palabras");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        contarPalabras("Introduccion_File/src/ejemploBufferedWriter.txt");
    }
}
