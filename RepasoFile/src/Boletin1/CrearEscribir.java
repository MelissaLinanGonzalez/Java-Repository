package Boletin1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Crear y escribir en un archivo
 * Crea un programa en Java que cree un archivo de texto llamado 'datos.txt' y escriba dentro de él un mensaje de bienvenida
 * */

public class CrearEscribir {
    public static void main(String[] args) {
        File archivo = new File("RepasoFile/src/datos.txt");

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
            escritor.write("Hola, esto es un nuevo archivo.txt.");
            escritor.newLine();
            escritor.write("Bienvenido!");
            escritor.close();
            System.out.println("Archivo 'datos.txt' creado y escrito con éxito");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
