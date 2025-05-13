package Boletin1;

import java.io.*;

/**
 * Copiar el contenido de un archivo a otro
 * Crea un programa que copie el contenido de 'datos.txt' en un nuevo archivo llamado 'copia.txt', mantenido el mismo formato
 * */

public class CopiarContenido {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");
        File copia = new File("RepasoFile/src/copia.txt");

        try {
            BufferedReader lector = new BufferedReader(new FileReader(datos));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(copia));

            String linea;
            while ((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }

            System.out.println("Archivo copiado con éxito");
            escritor.close();
            lector.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
