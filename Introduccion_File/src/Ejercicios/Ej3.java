package Ejercicios;

// Crea un metodo que permita buscar palabras en un fichero de texto. Se debe mostrar el numero de ocurrencias de dicha palabra. Utiliza un bufer para la lectura

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static int buscarPalabra(String palabraBuscar, File archivo){
        int contador = 0;

        if (!archivo.exists()){
            System.out.println("El archivo no existe");
            return 0;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null){
                // Se separan la línea en palabras y se comparan una a una
                String[] palabras = linea.split("\\s+"); // Se divide por espacios en blanco
                for (String palabra : palabras){
                    if (palabra.equals(palabraBuscar)){
                        contador++;
                    }
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return contador;
    }

    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/archivo.txt");

        int ocurrencias = buscarPalabra("Melissa", archivo);

        System.out.println("La palabra buscada aparece: " + ocurrencias);

    }
}
