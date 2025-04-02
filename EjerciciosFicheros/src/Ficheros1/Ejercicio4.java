package Ficheros1;

/*Agregar contenido a un archivo
* Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombreArchivo = "EjerciciosFicheros/src/Ficheros1/datos.txt";
        File archivo = new File(nombreArchivo);
        boolean agregar = false;

        try {
            agregar = archivo.exists();
            PrintWriter entrada = new PrintWriter(new FileWriter(archivo, agregar));
            String nuevoContenido = "\nNuevo contenido en el archivo datos.txt";
            entrada.println(nuevoContenido); // se añade el contenido
            entrada.close();
            System.out.println("Contenido añadido correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo" + e.getMessage());
        }
    }
}
