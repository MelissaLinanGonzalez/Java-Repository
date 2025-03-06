package TiendaOnline;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        if (producto.getStock() > cantidad){
            String nombre = producto.getNombre();
            double precio = producto.getPrecio();
            int cantidadComprada = cantidad;
            Producto p = new Producto(nombre, precio, cantidadComprada);
            productos.add(p);
            producto.reducirStock(cantidad);
        } else {
            System.out.println("El producto está sin stock");
        }
    }

    public void mostrarResumen(){
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }

    public void vaciarCarrito(){
        productos.clear();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
