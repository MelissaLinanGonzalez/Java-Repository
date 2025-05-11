package Teoria;// Crea un metodo que reciba el nombre de un archivo, y un entero. El metodo deberá crear el archivo y escribir 'n' líneas dentro. Cada linea debera tener escrito "Esta es la linea n", sustituyendo 'n' por el número de la línea. Utiliza un buffer para realizar la escritura de forma más eficiente

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EJ_BufferedWriter {
    public static void crearLineas(String nombreFichero, int numLineas){
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i<= numLineas; i++){
                bw.write("Esta es la línea " + i);
                bw.newLine();
            }

            // Cuando se cierra el BufferedWrriter se cierra tambien el FileWriter
            bw.close();
            System.out.println(nombreFichero + " creado con " + numLineas + " líneas");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        crearLineas("Introduccion_File/src/ejemploBufferedWriter.txt", 10);
    }
}
