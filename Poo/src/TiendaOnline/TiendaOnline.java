package TiendaOnline;

public class TiendaOnline {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Laptop", 1000.0, 5);
        Producto p2 = new Producto("Smartphone", 500.0, 10);
        Producto p3 = new Producto("Teclado", 50.0, 3);

        // Mostrar información inicial de productos
        System.out.println("Productos disponibles:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Crear un usuario
        Usuario usuario1 = new Usuario("Juan Pérez", "Calle Ficticia 123");

        // El usuario agrega productos al carrito
        System.out.println("\n--- Agregando productos al carrito ---");
        usuario1.getCarrito().agregarProducto(p1, 2);  // 2 laptops
        usuario1.getCarrito().agregarProducto(p2, 3);  // 3 smartphones
        usuario1.getCarrito().agregarProducto(p3, 1);  // 1 teclado

        // Mostrar el resumen del carrito
        System.out.println("\n--- Resumen del carrito de " + usuario1.getNombre() + " ---");
        usuario1.realizarPedido();

        // Mostrar el estado final de los productos para ver el stock después de la compra
        System.out.println("\n--- Estado final de los productos (después de la compra) ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
