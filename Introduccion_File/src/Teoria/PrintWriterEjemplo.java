package Teoria;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class PrintWriterEjemplo {
    public static void main(String[] args) {
        String fichero = "ejemplo.txt";
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fichero));
            pw.print("Esto es un texto sin salto de línea");
            pw.println("NUEVA PALABRA");
            pw.println("Esto es un texto con salto de línea");
            pw.println(4.5455);

            // Para repasar programación funcional
            Arrays.stream(new int[] {1, 2, 3, 4, 10})
                    .filter(n -> n > 2)
                    .map(n -> n * 2)
                    .forEach(pw::println);

            pw.close();
        } catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Problemas al escribir en el fichero");
        }
    }
}
