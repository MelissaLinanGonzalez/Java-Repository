package EjerciciosBasicos;

// Listar archivos en un directorio
// Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio

import java.io.File;

public class Ej11 {
    public static void main(String[] args) {
        File carpeta = new File(".");

        if (!carpeta.exists() || !carpeta.isDirectory()){
            System.out.println("La ruta proporcionada no es valida");
            return;
        }

        File[] elementos = carpeta.listFiles();

        if (elementos != null){
            for (File elemento : elementos){
                if (elemento.isFile()){
                    System.out.println(elemento.getName() + " -Archivo");
                } else if (elemento.isDirectory()){
                    System.out.println(elemento.getName() + " -Carpeta");
                }
            }
        } else {
            System.out.println("No se pudo listar los elementos de la carpeta");
        }
    }
}
