package EjercicioJSON.Ej1;

/*Continuacion del otro ejercicio, pero añadiendo diversos objetos al archivo JSON*/

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainAniadiendoVariosObjetos {
    public static void guardarObjetosJson(Producto nuevoProducto, File archivoJson){
        ObjectMapper mapper = new ObjectMapper();
        List<Producto> productos = new ArrayList<>();

        try {
            // Si el archivo existe y no está vacío, se lee para no borrar los productos existentes
            if (archivoJson.exists() && archivoJson.length() > 0){
                Producto[] listaProductos = mapper.readValue(archivoJson, Producto[].class);
                productos = new ArrayList<>(Arrays.asList(listaProductos));
            }

            productos.add(nuevoProducto); //Añadir el nuevo producto

            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJson, productos); // Se guarda la lista completa

            System.out.println("Producto guardado correctamente");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerObjetosJson(File archivoJson){
        ObjectMapper mapper = new ObjectMapper();

        try {
            if (!archivoJson.exists() || archivoJson.length() == 0){
                System.out.println("El archivo JSON está vacío o no existe");
                return;
            }
            Producto[] productos = mapper.readValue(archivoJson, Producto[].class);
            System.out.println("Productos del archivo JSON:");
            for (Producto producto : productos){
                System.out.println("Nombre: " + producto.getNombre() + ". Precio: " + producto.getPrecio());
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Añadir producto\t2. Leer productos\t0. Salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            File archivo = new File("Introduccion_File/src/EjercicioJSON/Ej1/Producto.json");
            if (opcion == 1){
                System.out.print("Nombre del producto: ");
                String nombre = entrada.nextLine();
                System.out.print("Precio: ");
                int precio = entrada.nextInt();
                entrada.nextLine();
                guardarObjetosJson(new Producto(nombre, precio), archivo);
            } else if (opcion == 2) {
                leerObjetosJson(archivo);
            } else if (opcion == 0) {
                System.out.println("Saliendo del programa....");
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }
}
