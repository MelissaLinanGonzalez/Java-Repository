package CRUD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorContacto gestor = new GestorContacto();
        int opcion = 0;
        boolean seguir = false;

        while (!seguir){
            System.out.println("*** GESTOR DE CONTACTOS ***");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Guardar y salir");
            System.out.print("Introduzca una opción: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    entrada.nextLine();
                    System.out.print("Introduzca el nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduzca el telefono: ");
                    String telefono = entrada.nextLine();
                    System.out.print("Introduzca el email: ");
                    String email = entrada.nextLine();

                    Contacto contacto = new Contacto(nombre, telefono, email);
                    gestor.agrgarContacto(contacto);
                    break;
                case 2:
                    System.out.print("Introduzca el nombre: ");
                    String nombreEliminar = entrada.nextLine();

                    gestor.eliminarContacto(nombreEliminar);
                    break;
                case 3:
                    System.out.print("Introduzca el nombre: ");
                    String nombreBuscado = entrada.nextLine();

                    gestor.buscarContacto(nombreBuscado);
                    break;
                case 4:
                    System.out.println("*** TODOS LOS CONTACTOS ***");
                    for (Contacto c : gestor.listarContactos()){
                        System.out.println(c4);
                    }
                    break;
                case 5:
                    System.out.println("Guardando los contactos y saliendo del programa...");
                    gestor.guardarContactos();
                    System.out.println("Bye!");
                    seguir = true;
                    break;
            }
        }
    }
}
