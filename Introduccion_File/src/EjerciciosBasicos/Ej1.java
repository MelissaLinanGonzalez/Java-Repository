package EjerciciosBasicos;

// Crear y escribir un archivo
// Crea un programa que cree un archivo de texto llamado 'datos.txt' y escriba dentro de él un mensaje de bienvenida.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
        try {
            File archivo = new File("Introduccion_File/src/datos.txt");
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

            if (archivo.exists()){
                escritor.write("Hola, esto es una prueba para crear un archivo y escribir en él");
                System.out.println("Archivo creado y escrito correctamente");
            }

            // IMPORTANTE cerrar el bufferedWriter para que se escriba en el archivo
            escritor.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
