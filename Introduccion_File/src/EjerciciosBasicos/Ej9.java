package EjerciciosBasicos;

// Renombrar un archivo
// Crea un programa que renombre el archivo 'datos.txt' a 'datos.txt', verificando que la operación se haya realizado con éxito

import java.io.File;

public class Ej9 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/datos.txt");
        File archivoNuevo = new File("Introduccion_File/src/informacion.txt");

        boolean renombrado = archivo.renameTo(archivoNuevo);

        if (renombrado){
            System.out.println("Archivo renombrado correctamente");
        } else {
            System.out.println("No se pudo renombrar el archivo");
        }
    }
}
