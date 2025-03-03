package Pedido;

public class Orden {
    private final int idOrden; //Es único y no se va a cambiar
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOdenes;

    public Orden(){
        this.idOrden = ++ Orden.contadorOdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // Inicializamos el array con el valor de prooductos máximos.
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProductos < MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto; //la variable contador productos nos permite obtener cuantos productos se han añadido. Se incrementa después de visualizarlo
        }else {
            System.out.println("Se ha superado el número de productos añadidos: " + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double sumaTotal = 0;
        for (int i = 0; i < this.contadorProductos; i ++){
            Producto producto = this.productos[i]; // recuperamos el producto que hay almacenado en el indice i
            sumaTotal += producto.getPrecio();
        }
        return sumaTotal;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double precioTotal = this.calcularTotal();
        System.out.println("\tTotal del pedido: " + precioTotal + "€");
        System.out.println("\tProductos del pedido: ");
        for (int i = 0; i < this.contadorProductos; i++){
            System.out.println("\t\t" + this.productos[i]);
        }
    }
}
