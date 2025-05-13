package EjercicioJSON.Ej2;

/*
 * Crear Clase Usuario y una Clase Main para trabajar con objetos en formato JSON. Al final deberás poder guardar una LISTA de usuarios
 * en un archivo.json y volver a leerla para reconstruir los objetos en memoria.
 *
 * Parte 2. Añade un campo int edad a la clase Usuario y por tanto, modifica el JSON.
 * Modifica la lista para que se lea desde teclado antes de guardarla.
 * Crea un metodo que recorra la lista y muestre los usuarios mayores de 30 años.*/

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void guardarUsuarioJson(Usuario usuario, File archivoJson) {
        ObjectMapper mapper = new ObjectMapper();
        List<Usuario> usuarios = new ArrayList<>();

        try {
            if (archivoJson.exists() && archivoJson.length() > 0){
                Usuario[] usu = mapper.readValue(archivoJson, Usuario[].class);
                usuarios = new ArrayList<>(Arrays.asList(usu));
            }

            usuarios.add(usuario);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJson, usuarios);
            System.out.println("Usuario guardado");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerUsuarioJson(File archivoJson){
        ObjectMapper mapper = new ObjectMapper();
        try {
            if (!archivoJson.exists() || archivoJson.length() < 0){
                System.out.println("Archivo JSON no existe o está vacío");
                return;
            }

            Usuario[] usuarios = mapper.readValue(archivoJson, Usuario[].class);
            System.out.println(" ");
            System.out.println("*** Usuarios añadidos ***");
            for (Usuario usuario : usuarios){
                System.out.println("Nombre: " + usuario.getNombre() + ". Email: " + usuario.getEmail());
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        File archivoJson = new File("Introduccion_File/src/EjercicioJSON/Ej2/Usuarios.json");
        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.println("*** MENÚ ***");
            System.out.println("1. Introducir usuario en el archivo JSON");
            System.out.println("2. Mostrar el archivo JSON");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 0: break;
                case 1:
                    System.out.print("Introduzca el nombre del usuario a añadir: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduzca el email del usuario: ");
                    String email = entrada.nextLine();

                    Usuario usuario = new Usuario(nombre, email);

                    guardarUsuarioJson(usuario, archivoJson);
                    break;
                case 2:
                    leerUsuarioJson(archivoJson);
                    System.out.println("");
            }
        }
    }

}
