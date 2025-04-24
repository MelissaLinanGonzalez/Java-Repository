package Ficheros1;

/*Buscar una palabra en el archivo
* Escribe un programa que busque una palabra especifica debtri del archivo datos.txt e indique cuántas veces aparece*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio7 {
    public static void main(String[] args) {
        String nombreArchivo = "EjerciciosFicheros/src/Ficheros1/datos.txt";
        int contador = 0;
        String palabraBuscada = "en";


        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
