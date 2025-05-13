package Boletin1;

import java.io.File;

/**
 * Eliminar archivo
 * Crea un programa que elimine el archivo 'informacion.txt' y muestre un mensaje confirmando su eliminación*/

public class BorrarArchivo {
    public static void main(String[] args) {
        File informacion = new File("RepasoFile/src/informacion.txt");

        if (informacion.exists()){
            if (informacion.delete()){
                System.out.println("Archivo 'informacion.txt' eliminado con éxito");
            }
        }
    }
}
