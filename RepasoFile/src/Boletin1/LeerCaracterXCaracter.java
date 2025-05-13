package Boletin1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer un archivo carácter por carácter
 * Escribe un programa que lea el archivo 'datos.txt' carácter por carácter y muestre el contenido por pantalla
 * */

public class LeerCaracterXCaracter {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");

        try {
            FileReader lector = new FileReader(datos);
            int caracter;

            while ((caracter = lector.read()) != -1){
                System.out.println((char) caracter);
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
