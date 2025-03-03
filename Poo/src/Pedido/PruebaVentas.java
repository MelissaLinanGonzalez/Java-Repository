package Pedido;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");
        Producto producto1 = new Producto("Blusa", 30.0);
        Producto producto2 = new Producto("Zapatos", 50.0);

        //Primera orden
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        Producto producto3 = new Producto("Camiseta", 15.00);
        Producto producto4 = new Producto("Pantalones", 25.50);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();
    }

}
