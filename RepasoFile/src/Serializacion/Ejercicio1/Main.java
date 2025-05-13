package Serializacion.Ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void guardarPersona(File archivo, Persona nuevaPersona){
        List<Persona> listaPersonas = new ArrayList<>();

        if (archivo.exists() && archivo.length() > 0){
            try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo))){
                listaPersonas = (List<Persona>) lector.readObject();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        listaPersonas.add(nuevaPersona);
        System.out.println("Persona guardad con éxito");

        try (ObjectOutputStream escrito = new ObjectOutputStream(new FileOutputStream(archivo))){
            escrito.writeObject(listaPersonas);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerObjetos(File archivo){
        List<Persona> listaPersona = new ArrayList<>();

        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo))){
            listaPersona = (List<Persona>) lector.readObject();
            for (Persona persona : listaPersona){
                System.out.println("Nombre: " + persona.getNombre() + " " + persona.getPrimerApellido() + " " + persona.getSegundoApellido() + "; Edad: " + persona.getEdad() + " años");
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        File archivo = new File("RepasoFile/src/Serializacion/usuario.ser");
        Scanner entrada = new Scanner(System.in);
        boolean seguir = false;

        while (!seguir){
            System.out.println("*** Gestion de usuarios ***");
            System.out.println("1. Añadir nuevo usuario");
            System.out.println("2. Leer el archivo");
            System.out.println("3. Salir");
            System.out.print("Introduzca una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    System.out.println(" ");
                    System.out.print("Introduce el nombre: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Introduce el primer apellido: ");
                    String pAp = entrada.nextLine();

                    System.out.print("Introduce el segundo apellido: ");
                    String sAp = entrada.nextLine();

                    System.out.print("Introduce la edad: ");
                    int edad = entrada.nextInt();

                    Persona persona = new Persona(nombre, pAp, sAp, edad);

                    guardarPersona(archivo, persona);
                    System.out.println(" ");
                    break;
                case 2:
                    leerObjetos(archivo);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Saliendo del programa ...");
                    seguir = true;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }
        }
    }
}
