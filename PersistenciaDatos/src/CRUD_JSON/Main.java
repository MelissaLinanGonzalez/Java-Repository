package CRUD_JSON;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorContactos gestor = new GestorContactos();
        int opcion = 0;

        do {
            System.out.println("*** GESTOR DE CONTACTOS ***");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Guardar y salir");
            System.out.print("Elige una opción");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Email: ");
                    String email = entrada.nextLine();
                    System.out.println("Teléfono: ");
                    String telefono = entrada.nextLine();

                    gestor.agregarContacto(new Contacto(nombre, telefono, email));
                    System.out.println("Contacto añadido correctamente!");
                    break;
                case 2:
                    System.out.print("Introduzca el nombre del contacto que desea eliminar: ");
                    String nombreEliminar = entrada.nextLine();
                    if (gestor.eliminarContacto(nombreEliminar)){
                        System.out.println("Contacto eliminado");
                    } else {
                        System.out.println("Contacto no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Introduzca el nombre del contacto que desea buscar: ");
                    String nombreBuscar = entrada.nextLine();
                    Contacto encontrado = gestor.buscarContacto(nombreBuscar);
                    if (encontrado != null){
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Contacto no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("*** TODOS LOS CONTACTOS ***");
                    for (Contacto contacto : gestor.listarContactos()){
                        System.out.println(contacto);
                    }
                    break;
                case 5:
                    gestor.guardarContactos();
                    System.out.println("Agenda guardad. Cerrando programa ...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
        entrada.close();
    }
}
