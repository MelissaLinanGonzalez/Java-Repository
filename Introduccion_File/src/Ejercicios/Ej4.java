package Ejercicios;

// Crea un metodo que permita eliminar todas la ocurrencias de una palabra dada en un fichero de texto. Este codigo producirá automáticamente un nuevo fichero con la siguiente nomenclatura: Si el fichero de entrada se llama fichero.txt, el fichero generado se llamará fichero_2.txt

import java.io.*;

public class Ej4 {
    public static void eliminarPalabra(File archivoOriginal, String palabraEliminar){
        if (!archivoOriginal.exists() || !archivoOriginal.isFile()){
            System.out.println("El archivo introducido no es correcto");
        }

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
            String nombre = archivoOriginal.getName();
            String nuevoNombre;

            // Se comprueba si el archivo proporcionado tiene extension
            int indicePunto = nombre.lastIndexOf(".");

            if (indicePunto != -1){
                // Si el indice del punto es distinto a -1 significa que tiene extension, por lo que hay que separar el nombre de la extension
                String nombreBase = nombre.substring(0, indicePunto);
                String extension = nombre.substring(indicePunto);
                nuevoNombre = nombreBase + "_2" +  extension;
            } else {
                nuevoNombre = nombre + "_2";
            }

            // Se crea el archivo en la misma carpeta
            File archivoNuevo = new File(archivoOriginal.getParent(), nuevoNombre);

            // Procesamos linea a linea
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo))){
                String linea;

                while ((linea = lector.readLine()) != null){
                    // Se elimina la palabra exacta y limpia espacios extra
                    linea = linea.replaceAll("\\b" + palabraEliminar + "\\b", "")
                            .replaceAll("\\s{2,}", "")
                            .trim();
                    escritor.write(linea);
                    escritor.newLine();
                }
            }
            System.out.println("Archivo nuevo creado: " + archivoNuevo.getAbsolutePath());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        File archivo1 = new File("Introduccion_File/src/archivo.txt");

        eliminarPalabra(archivo1, "Melissa");
    }
}
