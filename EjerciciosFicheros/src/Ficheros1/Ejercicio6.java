package Ficheros1;

/*Copiar el contenido de un archivo a otro
* Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato*/

import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        try{
            BufferedReader lector = new BufferedReader(new FileReader("EjerciciosFicheros/src/Ficheros1/datos.txt"));

            BufferedWriter escritor = new BufferedWriter(new FileWriter("EjerciciosFicheros/src/Ficheros1/copia.txt"));

            String linea;

            while ((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }

            lector.close();
            escritor.close();
            System.out.println("Archivo copiado correctamente");
        } catch (IOException e){
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
