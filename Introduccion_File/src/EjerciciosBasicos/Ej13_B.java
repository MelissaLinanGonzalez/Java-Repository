package EjerciciosBasicos;

import java.io.*;
import java.util.Scanner;

public class Ej13_B {
    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void copiarBinario(String rutaOrigen, String rutaDestino){

        try {
            File archivoOrigen = new File(rutaOrigen);
            File archivoDestino = new File(rutaDestino);

            if (existeArchivo(archivoOrigen)){
                FileInputStream entrada = new FileInputStream(archivoOrigen);
                FileOutputStream salida = new FileOutputStream(archivoDestino);

                entrada.transferTo(salida);
                System.out.println("Archivo copiado correctamente");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.print("Introduce la ruta de ORIGEN donde se encuentre la imagen que desea copiar: ");
        Scanner sc = new Scanner(System.in);
        String rutaOrigen = sc.nextLine();
        System.out.print("Introduce la ruta de DESTINO donde desea copiar la imagen: ");
        String rutaDestino = sc.nextLine();

        copiarBinario(rutaOrigen, rutaDestino);
    }
}
