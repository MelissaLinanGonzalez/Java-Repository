package Producto;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Producto buscarProducto (int codigo){
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo){
                return producto;
            }
        }
        return null;
    }

    public void mostrarInventario (){
        if (productos.isEmpty()){
            System.out.println("El inventario está vacío");
        } else {
            System.out.println("Productos del inventario:");
            for (Producto producto : productos){
                producto.mostrarInformacion();
            }
        }
    }

    public void venderProducto(int codigo, int cantidad) {
        Producto producto = buscarProducto(codigo);
        if (producto == null) {
            System.out.println("El producto con el código " + codigo + " no existe.");
        } else {
            boolean ventaOk = producto.reducirStock(cantidad);
            if (ventaOk) {
                System.out.println("Venta realizada correctamente. Stock restante: " + producto.getCantidadStock());
            }
        }
    }

}
