package Pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private String nombre;
    private int telefono;
    private static int codigoPedido = 0;
    private int numeroIngredientes;
    private ArrayList<Integer> ingredientes;

    public Pedido(String nombre, int telefono, ArrayList<Integer> ingredientes){
        this.nombre = nombre;
        this.telefono = telefono;
        this.ingredientes = ingredientes;
        Pedido.codigoPedido ++;
        numeroIngredientes = ingredientes.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public static int getCodigoPedido() {
        return codigoPedido;
    }

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    @Override
    public String toString() {
        return "Pedido" + codigoPedido + "{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", numeroIngredientes=" + numeroIngredientes +
                ", ingredientes=" + ingredientes +
                '}';
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce el número de teléfono");

        
    }
}
