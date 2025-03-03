package Pedido;

public class Producto {
    private final int idProducto; // es final porque este valor no se va a modificar nunca.
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto(String nombre, double precio){
        this.idProducto = ++ Producto.contadorProductos; //Se incrementa en 1 la variable estática y se igual el idProducto.
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + this.idProducto +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio + "€" +
                '}';
    }
}
