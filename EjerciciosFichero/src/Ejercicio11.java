//Listar archivos en un directorio
//Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es archivo o directorio

import java.io.File;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Introducimos la ruta de la carpeta que queremos listar todos los archivos
        String ruta = "EjerciciosFichero/src";

        File directorio = new File(ruta);

        File [] archivos = directorio.listFiles();

        if (archivos != null){
            for (File archivo : archivos){
                String tipo = "Archivo";
                if (archivo.isDirectory()){
                    tipo = "Directorio";
                }
                System.out.println(tipo + ": " + archivo.getName());
            }
        }

    }
}
