package EjerciciosBasicos;

// Copiar un archivo binario (imagen o vídeo)
// Crea un programa en Java que copie un archivo binario (por ejemplo, una imagen.jpg) de un directorio a otro sin modificar su contenido

import java.io.*;

public class Ej13 {
    public static void main(String[] args) {
        String rutaOrigen = "Introduccion_File/src/Imagenes/Solución de Datos ERM.png";
        String rutaDestino = "Introduccion_File/src/imagenCopia.png";

        copiarArchivoBinario(rutaOrigen, rutaDestino);
    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void copiarArchivoBinario(String rutaOrigen, String rutaDestino){
        try {
            File archivoOrigen = new File(rutaOrigen);
            File archivoDestino = new File(rutaDestino);

            if (existeArchivo(archivoOrigen)){

                // Se crea el flujo de entrada y salida
                FileInputStream entrada = new FileInputStream(archivoOrigen);
                FileOutputStream salida = new FileOutputStream(archivoDestino);

                File imagen = new File(rutaOrigen);
                int pesoImagen = (int)imagen.length();

                // Buffer de lectura y escritura de bloques de datos
                byte[] buffer = new byte[pesoImagen];
                int bytesLeidos = 0;

                // Se lee y se escriben los bloques de datos;
                while ((bytesLeidos = entrada.read(buffer)) != -1){
                    salida.write(buffer, 0, bytesLeidos);
                }

                System.out.println("Tamaño de la imagen: " + pesoImagen + " bytes");
                System.out.println("Archivo binario copiado correctamente");

                entrada.close();
                salida.close();
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
