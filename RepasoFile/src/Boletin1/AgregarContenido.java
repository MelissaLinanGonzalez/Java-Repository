package Boletin1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Agregar contenido a un archivo
 * Modifica el archivo 'datos.txt' para agregar nuevas líneas de texto sin borrar el contenido anterior*/

public class AgregarContenido {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(datos, true));

            escritor.newLine();
            escritor.write("Hola esto es un ejemplo de apendar una linea");
            escritor.newLine();
            escritor.write("Esto es otro ejemplo de salto de línea y nueva línea escrita");

            System.out.println("Archivo modificado correctamente");
            escritor.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
