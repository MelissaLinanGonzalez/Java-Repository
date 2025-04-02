package Ficheros1;
/*Crear y escribir en un archivo
 * Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombreArchivo = "EjerciciosFicheros/src/Ficheros1/datos.txt";
        String mensaje = "Hola, esto es un archivo nuevo en Java";

        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            BufferedWriter escritor = new BufferedWriter(archivo);

            escritor.write(mensaje);
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
