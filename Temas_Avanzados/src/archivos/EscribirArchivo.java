package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
    public static void main(String[] args) {
        boolean agregar = false;
        String nombreArchivo = "miArchivo.txt";
        File archivo = new File(nombreArchivo);
        try {
            // Revisamos si existe el archivo
            agregar = archivo.exists(); // Pregunta si el archivo existe
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, agregar));
            // Si la variable agregar es true, no se sobreescribe el contenido, si no que se agrega al final del archivo.
            String nuevoContenido = "\nNuevo\ncontenido";
            salida.println(nuevoContenido); // Añade el contenido al archivo
            salida.close();
            System.out.println("Se añadió: " + nuevoContenido + " al archivo");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
