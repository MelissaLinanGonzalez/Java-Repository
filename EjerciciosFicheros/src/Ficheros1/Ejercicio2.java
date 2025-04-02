package Ficheros1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosFicheros/src/Ficheros1/datos.txt";
        try
        {
            FileReader fr = new FileReader(rutaArchivo);
            int caracter;
            while ((caracter = fr.read()) != -1) {
                System.out.println((char) caracter);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " +  e.getMessage());
        }


    }
}
