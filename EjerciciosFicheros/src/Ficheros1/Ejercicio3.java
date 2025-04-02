package Ficheros1;

/*Leer un archivo línea por línea
* Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada linea en la consola*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombreArchivo = "EjerciciosFicheros/src/Ficheros1/datos.txt";
        File archivo = new File(nombreArchivo);

        try {
            System.out.println("--- Contenido del archivo por líneas ---");

            BufferedReader salida = new BufferedReader(new FileReader(archivo));
            String linea = salida.readLine();

            while (linea != null){
                System.out.println(linea);
                linea = salida.readLine();
            }
        } catch (Exception e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
