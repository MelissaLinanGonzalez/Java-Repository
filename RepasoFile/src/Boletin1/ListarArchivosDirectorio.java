package Boletin1;

import java.io.File;
import java.util.List;

/**
 * Listar archivos de un directorio
 * Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio*/

public class ListarArchivosDirectorio {
    public static void main(String[] args) {
        File carpeta = new File("/home/melissa/Escritorio/Programación/Java-Repository");

        if (!carpeta.exists() || !carpeta.isDirectory()){
            System.out.println("La ruta proporcionada no corresponde a una carpeta");
            return;
        }

        File[] elementos = carpeta.listFiles();

        if (elementos != null){
            System.out.println("*** Elementos de la carpeta " + carpeta.getName() + " ***");
            for (File elemento : elementos){
                if (elemento.isDirectory()){
                    System.out.println(elemento.getName() + " ________ Carpeta");
                } else if (elemento.isFile()) {
                    System.out.println(elemento.getName() + " ________ Archivo");
                }
            }
        } else {
            System.out.println("La carpeta está vacía");
        }
    }
}
