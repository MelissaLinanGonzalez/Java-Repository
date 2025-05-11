package Ejercicios;

// Crea un metodo que dee crear 'n' archivos, nombre(1).txt, nombre(2).txt... nombre(n).txt en la carpeta que se solicita al usuario. Dentro de cada archivo deberá escribirse la frase "Este es el fichero nombre(n).txt".

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej2 {
    public static void cearArchivos(int n, File carpeta, String nombreBase){
        if (!carpeta.exists()){
            System.out.println("La carpeta no existe");
            return;
        }

        if (!carpeta.isDirectory()){
            System.out.println("La ruta proporcionada no es de una carpeta");
            return;
        }

        for (int i = 1; i <= n; i++){
            String nombreArchivo = nombreBase + "(" + i + ").txt";
            File archivo = new File(carpeta, nombreArchivo);
            try (FileWriter writer = new FileWriter(archivo)){
                writer.write("Este es el fichero " + nombreArchivo);
                System.out.println("Archivo creado: " + archivo.getName());
            } catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la ruta de la carpeta: ");
        String ruta = entrada.nextLine();

        System.out.print("¿Cuántos archivos quieres crear?: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Introduce el nombre base del archivo: ");
        String nombreBase = entrada.nextLine();

        File carpeta = new File(ruta);
        cearArchivos(cantidad, carpeta, nombreBase);

        entrada.close();
    }
}
