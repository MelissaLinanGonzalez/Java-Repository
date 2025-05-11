package EjerciciosBasicos;

// Leer un archivo carácter por carácter
// Escribe un programa que lea el archivo 'datos.txt' caracter por caracter y muestre el contenido por pantalla

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.txt");

        try {
            FileReader lector = new FileReader(archivo);
            int caracter;

            // Leemos el archivo caracter por caracter
            while ((caracter = lector.read()) != -1){
                System.out.println((char) caracter);
            }

            lector.close();
            System.out.println("Lectura terminada");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
