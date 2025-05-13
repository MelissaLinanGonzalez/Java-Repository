package EjerciciosBoletin3;

/*Nombre y apellidos
* Implementa un programa que genere aleatoriamente nombres de personas (combinando nombres y apellidos de 'usa_nombres.txt' y 'usa_apellidos'.txt). Se le pedirá al usuario cuántos nombres de personas desea generar y a qué archivo añadirlos (por ejemplo 'usa_nombre_completos.txt').*/

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

        // Leemos los nombres
        try {
            BufferedReader lectorNombres = new BufferedReader(new FileReader(nombres));
            String linea;
            while ((linea = lectorNombres.readLine()) != null){
                listaNombres.add(linea.trim());
            }
            lectorNombres.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Leemos los apellidos
        try {
            BufferedReader lectorApellidos = new BufferedReader(new FileReader(apellidos));
            String lineaA;
            while ((lineaA = lectorApellidos.readLine()) != null){
                listaApellidos.add(lineaA.trim());
            }
            lectorApellidos.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Comprobamos que ambas listas no esten vacias
        if (listaNombres.isEmpty() || listaApellidos.isEmpty()){
            System.out.println("Uno de los archivos está vacío");
        }

        // Se genera la combinacion y se escribe en el archivo final
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoFinal));
            for (int i = 0; i < cantidad; i++) {
                String nombre = listaNombres.get(random.nextInt(listaNombres.size()));
                String apellido = listaApellidos.get(random.nextInt(listaApellidos.size()));
                escritor.write(nombre + " " + apellido);
                escritor.newLine();
            }
            escritor.close();

            System.out.println("Archivo generado correctamente");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


        return archivofinal;
    }
}
