package Producto;

import java.util.Scanner;

public class GestionInventario {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("--Menú de gestión del inventario--");
            System.out.println("1. Agregar un nuevo producto al inventario");
            System.out.println("2. Mostrar el inventario");
            System.out.println("3. Vender un producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4)");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1: //agregar producto al inventario
                    System.out.print("Introduce el código del producto: ");
                    int codigo = entrada.nextInt();
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precio = entrada.nextDouble();
                    System.out.println("Introduce la cantidad del producto: ");
                    int cantidad = entrada.nextInt();

                    Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidad);

                    inventario.agregarProducto(nuevoProducto);
                    System.out.println("Producto agregado correctamente...");
                    System.out.println("");
                    break;
                case 2: //mostrar el inventario
                    inventario.mostrarInventario();
                    System.out.println("");
                    break;
                case 3: //vender el producto
                    System.out.print("Introduce el código del producto: ");
                    int codigoVenta = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Introduce la cantidad que deseas vender: ");
                    int cantidadVenta = entrada.nextInt();

                    inventario.venderProducto(codigoVenta, cantidadVenta);

                    break;
                case 4: //salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo");
                    System.out.println("");
            }
        } while (opcion != 4);
    }

}
