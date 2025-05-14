package Bol1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Crear y escribir en un archivo
 * Crea un programa que cree un archivo de texto llamado 'datos.txt' y escriba dentro de él un mensaje de bienvenida
 * **/

public class ej1 {
    public static void main(String[] args) {
        File datos = new File("RepasoFile2/src/Bol1/datos.txt");

        try {
            BufferedWriter escrito = new BufferedWriter(new FileWriter(datos));
            escrito.write("Hola esto es un mensaje de bienvenida");
            escrito.close();
        } catch (IOException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
