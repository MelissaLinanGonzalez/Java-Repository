package TiendaOnline;

public class Usuario {
    private String nombre;
    private String direccion;
    private Carrito carrito;

    public Usuario(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        carrito = new Carrito();
    }

    public void realizarPedido(){
        carrito.mostrarResumen();
        carrito.vaciarCarrito();
        System.out.println("Pedido completado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
