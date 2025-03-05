package Ejercicio7_EntradasExpo;

/*
* Se quiere gestionar la venta de entradasde Expochoches Campanillas, que tiene 3 zonas:
* - La sala Principal con 1000 entradas disponible.
* - La zona de compra-venta con 200 entradas disponibles.
* - La zona VIP con 25 entradas disponibles.
*/

public class Zona {
    private String nombre;
    private int entradasDisponibles;

    public Zona(String nombre, int entradasDisponibles){
        this.nombre = nombre;
        this.entradasDisponibles = entradasDisponibles;
    }

    public void mostrarEntradas(){
        System.out.println(nombre + ": " + entradasDisponibles + " entradas disponibles");
    }

    public void venderEntradas(int cantidad){
        if (cantidad <= 0){
            System.out.println("Ingrese una cantidad positiva");
        } else if (cantidad > entradasDisponibles){
            System.out.println("No hay suficientes entradas disponibles en " + nombre + ". Quedan " + entradasDisponibles + " entradas");
        } else {
            entradasDisponibles -= cantidad;
            System.out.println("Se han vendido " + cantidad + " entradas en " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }
}
