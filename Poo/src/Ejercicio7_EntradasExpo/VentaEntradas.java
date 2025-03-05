package Ejercicio7_EntradasExpo;

import java.util.Scanner;

public class VentaEntradas {
    private static Zona salaPrincipal = new Zona("Sala Principal", 1000);
    private static Zona zonaCompraVenta = new Zona("Zona Compra-Venta", 200);
    private static Zona zonaVIP = new Zona("Zona VIP", 25);


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("");
            System.out.println("*** Menú de gestión de entradas ***");
            System.out.println("1. Mostrar entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Introduzca la opción deseada: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("");
                    System.out.println("Entradas disponibles:");
                    salaPrincipal.mostrarEntradas();
                    zonaCompraVenta.mostrarEntradas();
                    zonaVIP.mostrarEntradas();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Opciones disponibles para comprar las entradas: " + salaPrincipal.getNombre() + ", " + zonaCompraVenta.getNombre() + " o en la " + zonaVIP.getNombre());
                    System.out.print("¿Dónde desea comprar las entradas?: ");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.print("Introduzca el número de entradas: ");
                    int entradas = entrada.nextInt();

                    //Se compara si el nombre introducido es igual al nombre de las zonas creadas y se realiza la venta.
                    if (nombre.equals(salaPrincipal.getNombre()) ){
                        salaPrincipal.venderEntradas(entradas);
                    } else if (nombre.equals(zonaCompraVenta.getNombre()) ) {
                        zonaCompraVenta.venderEntradas(entradas);
                    } else if (nombre.equals(zonaVIP.getNombre()) ) {
                        zonaVIP.venderEntradas(entradas);
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no válida, introduzca un número correcto");
            }
        } while (opcion !=3);
    }
}
