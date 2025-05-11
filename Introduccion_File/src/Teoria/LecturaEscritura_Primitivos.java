package Teoria;

import java.io.*;

public class LecturaEscritura_Primitivos {
    public static void main(String[] args) {
        String fichero = "Introduccion_File/src/ejemplo.dat";
        String nombre = "MLG";
        int conv = 1;
        double nota = 9.99;

        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fichero));
            out.writeUTF(nombre);
            out.writeInt(conv);
            out.writeDouble(nota);
            out.close();

            DataInputStream in = new DataInputStream(new FileInputStream(fichero));
            System.out.println("Valor leído de nombre: " + in.readUTF());
            System.out.println("Valor leído de convocatoria: " + in.readInt());
            System.out.println("Valor leído de nota: " + in.readDouble());
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("No encontrado: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
