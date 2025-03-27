package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "miArchivo.txt";
        File archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo existe");
            } else {
                //Creamos archivo
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                //Se guarda el archivo en el disco duro
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
