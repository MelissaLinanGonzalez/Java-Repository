package EjerciciosBoletin3;

/*Diccionario
* Implementa un programa que cree la carpeta 'Diccionario' con tantos archivos como letras del abecedario (A.txt, B.txt...). Introducirá en cada archivo las palabras de 'diccionario.txt' que comiencen por dicha letra*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej5 {
    public static void main(String[] args) {
        String rutaDiccionario = "Introduccion_File/src/Documentos/diccionario.txt";
        String rutaCarpeta = "Introduccion_File/src/Documentos/Diccionario";

        // Crear la carpeta Diccionario si no existe
        File carpeta = new File("Introduccion_File/src/Documentos/Diccionario");
        if (!carpeta.exists()){
            boolean carpetaCreada = carpeta.mkdir();
            if (!carpetaCreada){
                System.out.println("No se pudo crear la carpeta");
            }
        }

        // Mapear para agrupar las palabras por su primera letra
        Map<Character, List<String>> palabraPorLetra = new HashMap<>();

        // Inicializar listas para todas las letras A-Z
        for (char c = 'A'; c <= 'Z' ; c++) {
            palabraPorLetra.put(c, new ArrayList<>());
        }

        // Leer el archivo de entrada es decir, diccionario.txt
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaDiccionario));
            String palabra;
            while ((palabra = lector.readLine()) != null){
                palabra = palabra.trim();
                if (!palabra.isEmpty()){
                    char primeraLetra = Character.toUpperCase(palabra.charAt(0));
                    if (palabraPorLetra.containsKey(primeraLetra)){
                        palabraPorLetra.get(primeraLetra).add(palabra);
                    }
                }
            }
            lector.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (char letra = 'A'; letra <= 'Z'; letra++){
            File archivoLetra = new File(carpeta, letra + ".txt");
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoLetra));
                for (String palabra : palabraPorLetra.get(letra)){
                    escritor.write(palabra);
                    escritor.newLine();
                }
                escritor.close();
            } catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Diccionario clasificado por letras correctamente");
    }
}
