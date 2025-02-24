package Producto;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = productos;
    }



    public void agregarProducto(Producto producto){
        productos.add(producto);
        System.out.println("Producto añadido correctamente");
    }

    public void buscarProducto (int codigo){
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo){
                System.out.println("El producto con código " + codigo + " es el siguiente: ");
                producto.mostrarInformacion();
            } else {
                System.out.println("Producto no encontrado");
            }
        }
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

    public int venderProducto (int codigo, int cantidad){
        for (Producto producto : productos){
            if (producto.getCodigo() == codigo){
                producto.reducirStock(cantidad);
            }
        }
    }

}
