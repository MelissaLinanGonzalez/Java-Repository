package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer archivo
        String nombreArchivo = "miArchivo.txt";
        File archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido del archivo: ");
            // Abrir el archivo para la lectura
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            // la clase BufferedReader nos permite leer líneas completas
            String linea = entrada.readLine();
            // Leemos todas las líneas de nuestro archivo
            while (linea != null){
                System.out.println(linea);
                // antes de terminar el ciclo, pasamos a la siguiente línea
                linea = entrada.readLine();
            }
            // IMPORTANTE cerrar el archivo
            entrada.close();
        } catch (Exception e){
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
