package EjerciciosBasicos;

// Agregar contenido a un archivo
// Modifica el archivo 'datos.txt' para agregar lineas de texto sin borrar el contenido anterior

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ej4 {
    public static void main(String[] args) {
        String ruta = "Introduccion_File/src/datos.txt";

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true));
            escritor.newLine();
            escritor.write("Nueva linea 1");
            escritor.newLine();
            escritor.write("Nueva linea 2");
            System.out.println("Contenido añadido correctamente");

            escritor.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
