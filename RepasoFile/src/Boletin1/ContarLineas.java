package Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");
        int contador = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(datos));
            String linea;
            while ((linea = lector.readLine()) != null){
                contador++;
            }

            System.out.println("El archivo " + datos.getName() + " tiene " + contador + " líneas");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
