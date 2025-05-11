package Teoria;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaBinarios {
    public static void main(String[] args) {
        String nombre = "Introduccion_File/src/Imagenes/ChatGPT Image 10 abr 2025, 17_00_39.png";

        // Leer datos desde el archivo binario
        try {
            FileInputStream fis = new FileInputStream(nombre);
            int num;
            System.out.println("Datos leídos desde el archivo binario:");
            while ((num = fis.read())!= -1){
                System.out.println(num + " ");
            }
            fis.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
