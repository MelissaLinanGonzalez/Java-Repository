package Boletin1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copiar un archivo binario (imagen o vídeo)
 * Crea un programa que copie un archivo binario (por ejemplo una imagen.jpg) de un directorio a otro sin modificar su contenido*/

public class CopiarBinario {
    public static void main(String[] args) {
        File origen = new File("Introduccion_File/src/Imagenes/ChatGPT Image 10 abr 2025, 17_00_39.png");
        File destino = new File("RepasoFile/src/imagen.png");

        try {
            if (origen.exists()){
                FileInputStream imagenOrigen = new FileInputStream(origen);
                FileOutputStream imagenDestino = new FileOutputStream(destino);

                imagenOrigen.transferTo(imagenDestino);

                System.out.println("Imagen copiada correctamente");
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
