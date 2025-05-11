package Teoria;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LecturaEscritura_PrintWriter_Scanner {
    public static void main(String[] args) {
        try {
            String nombreFichero = "ficheroEnteros.txt";
            PrintWriter pwr = new PrintWriter(nombreFichero);

            for (int i = 1; i <= 1000; i++) {
                pwr.print(i + " ");
                if (i % 100 == 0){
                    pwr.println();
                }
            }
            pwr.close();

            Scanner entrada = new Scanner(new FileReader(nombreFichero));
            while (entrada.hasNext()){
                System.out.println("Valor leido: " + entrada.nextInt());
            }
            entrada.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
