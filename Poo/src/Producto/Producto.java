package Producto;

/*Atributos
* codigo (int) codigo unico del producto
* nombre (string) nombre del producto
* precio (double) precio del producto
* cantidadStock (int) cantidad disponible en el inventario
*
* Metodos
* constructor
* mostrar la información del producto
* reducir el stock de la cantidad especificada, validando que no supere el stock disponible
* incrementar el stock en la cantidad especificada*/

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Producto(int codigo, String nombre, double precio, int cantidadStock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public void mostrarInformacion(){
        System.out.println("Código del producto: " + getCodigo());
        System.out.println("Nombre del producto: " + getNombre());
        System.out.println("Precio del producto: " + getPrecio());
        System.out.println("Cantidad disponible en stock: " + getCantidadStock());
    }

    public boolean reducirStock(int cantidad){
        if (cantidad <= cantidadStock){
            cantidadStock -= cantidad;
        } else {
            System.out.println("La cantidad introducida es superior al stock disponible");
        }
        return true;
    }

    public void incrementarStock(int cantidad){
        cantidadStock += cantidad;
    }

}
