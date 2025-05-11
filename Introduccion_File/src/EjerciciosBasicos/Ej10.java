package EjerciciosBasicos;

// Eliminar un archivo
// Crea un programa que elimine el archivo 'informacion.txt' y muestre un mensaje confimando su eliminacion

import java.io.File;

public class Ej10 {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/informacion.txt");

        if (archivo.exists()){
            System.out.println("El archivo existe, vamos a proceder a eliminarlo...");
            if (archivo.delete()){
                System.out.println("Archivo borrado correctamente");
            } else {
                System.out.println("No se ha podido borrar el archivo");
            }
        } else {
            System.out.println("El archivo no existe, por lo que no se puede eliminar");
        }
    }
}
