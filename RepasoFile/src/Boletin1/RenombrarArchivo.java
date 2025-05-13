package Boletin1;

import java.io.File;

/**
 * Renombrar archivo
 * Desarrolla un programa que renombre el archivo 'datos.txt' a 'información.txt', verificando que la operación se haya realizado con éxito*/

public class RenombrarArchivo {
    public static void main(String[] args) {
        File datos = new File("RepasoFile/src/datos.txt");
        File informacion = new File("RepasoFile/src/informacion.txt");

        if (datos.exists()){
            if (datos.renameTo(informacion)){
                System.out.println("Nombre del archivo cambiado con éxito");
            }
        }
    }
}
