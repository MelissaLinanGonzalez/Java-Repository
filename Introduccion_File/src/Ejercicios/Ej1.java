package Ejercicios;

// Crea un metodo que reciba una carpeta y liste el contenido de dicha carpeta de aquellos archivos cuya extension sea .txt. Crea una sobrecarga para que el metodo reciba el tipo de archivo a listar

import java.io.File;

public class Ej1 {
    public static void listarTxt(File carpeta){
        if (carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles(); //listFiles devuelve un array con los ficheros que contiene
            if (archivos != null){
                for (File archivo : archivos){
                    if (archivo.isFile() && archivo.getName().endsWith(".txt")){ // archivo.isFile filtra pra asegurar que no es una subcarpeta y endsWith filtra por la extension
                        System.out.println(archivo.getName());
                    }
                }
            } else {
                System.out.println("No se pudo acceder al contenido de la carpeta");
            }
        } else {
            System.out.println("La ruta proporcionada no es una carpeta válida");
        }
    }

    public static void listarPorExtension(File carpeta, String extension){
        if (carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles(); //listFiles devuelve un array con los ficheros que contiene
            if (archivos != null){
                for (File archivo : archivos){
                    if (archivo.isFile() && archivo.getName().endsWith(extension)){ // archivo.isFile filtra pra asegurar que no es una subcarpeta y endsWith filtra por la extension
                        System.out.println(archivo.getName());
                    }
                }
            } else {
                System.out.println("No se pudo acceder al contenido de la carpeta");
            }
        } else {
            System.out.println("La ruta proporcionada no es una carpeta válida");
        }
    }

    public static void main(String[] args) {
        File carpeta = new File("/home/melissa/Escritorio/Programación/Java-Repository");

        listarTxt(carpeta);
        System.out.println(" ");
        listarPorExtension(carpeta, ".json");
    }
}
