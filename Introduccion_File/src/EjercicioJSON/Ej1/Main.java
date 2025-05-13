package EjercicioJSON.Ej1;

/*Crear un archivo JSON y guardar el producto creado, crear metodo para leer el JSON*/

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Movil", 800);
        File archivoJSON = new File("Introduccion_File/src/EjercicioJSON/Ej1/Producto.json");

        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir producto en el Json" + "\t2.Leer Json");
        int seleccion = entrada.nextInt();
        if (seleccion == 1){
            guardarObjetoJson(p1, archivoJSON);
        } else if (seleccion == 2){
            leerObjetoJson(archivoJSON);
        }
    }

    public static void guardarObjetoJson(Producto producto, File archivoJson){
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJson, producto);
            System.out.println("Producto " + producto.getNombre() + " guardado en " + archivoJson.getName());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerObjetoJson(File archivoJson){
        ObjectMapper mapper = new ObjectMapper();

        try {
            Producto productoJson = mapper.readValue(archivoJson, Producto.class);
            System.out.println("Nombre: " + productoJson.getNombre() + ", Precio: " + productoJson.getPrecio());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
