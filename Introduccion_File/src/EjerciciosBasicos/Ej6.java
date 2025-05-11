package EjerciciosBasicos;

// Copiar el contenido de un archivo a otro
// Crea un programa que copie el contenido de 'datos.txt' en un nuevo archivo llamado 'copia.txt', manteniendo el mismo formato

import java.io.*;

public class Ej6 {
    public static void main(String[] args) {
        File archivoOriginal = new File("Introduccion_File/src/datos.txt");
        File archivoNuevo = new File("Introduccion_File/src/copia.txt");
        String linea;
        String[] palabras;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo));
            while ((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }

            escritor.close();
            lector.close();
            System.out.println("Archivo copiado");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
