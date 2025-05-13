package EjerciciosBoletin3;

/*Ordenando archivos
* Implementa un programa que pida al usuario un nomnbre de archivo A para lectura y otro nombre de archivo B para escritura. Leerá el contenido del archivo A (por ejemplo 'usa_personas.txt') y lo escribirá ordenado alfabéticamente en B (por ejemplo 'usa_personas_sorted.txt')*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
        File archivoOriginal = new File("Introduccion_File/src/Documentos/usa_personas.txt");
        File archivoNuevo = new File("Introduccion_File/src/Documentos/usa_personas_sorted.txt");

        List<String> lineas = new ArrayList<>();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo));
            String linea;

            while ((linea = lector.readLine()) != null){
                lineas.add(linea);
            }

            // Se ordena la lista alfabéticamente
            Collections.sort(lineas);

            // Se escriben las lineas ordenadas en el nuevo archivo
            try {
                for (String l : lineas){
                    escritor.write(l);
                    escritor.newLine();
                }
                escritor.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            lector.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
