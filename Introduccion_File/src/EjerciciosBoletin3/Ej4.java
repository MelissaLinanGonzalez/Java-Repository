package EjerciciosBoletin3;

/*Nombre y apellidos
* Implementa un programa que genere aleatoriamente nombres de personas (combinando nombres y apellidos de 'usa_nombres.txt' y 'usa_apellidos'.txt). Se le pedirá al usuario cuántos nombres de personas desea generar y a qué archivo añadirlos (por ejemplo 'usa_personas.txt').*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        // Pedimos al usuario cuántos nombres quiere generar
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce cuántos nombres deseas generar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Introduce la ruta donde se encuentra la lista de nombres: ");
        String rutaNombres = entrada.nextLine();
        System.out.print("Introduce la ruta donde se encuentra la lista de apellidos: ");
        String rutaApellido = entrada.nextLine();
        System.out.print("Introduce la ruta donde desea guardar la lista de nombres creados: ");
        String archivoFinal = entrada.nextLine();

        crearNombre(cantidad, rutaNombres, rutaApellido, archivoFinal);

    }

    public static File crearNombre(int cantidad, String rutaNombre, String rutaApellido, String archivoFinal){
        File nombres = new File(rutaNombre);
        File apellidos = new File(rutaApellido);
        File archivofinal = new File(archivoFinal);

        List<String> listaNombres = new ArrayList<>();
        List<String> listaApellidos = new ArrayList<>();
        Random random = new Random();


        return archivofinal;
    }
}
