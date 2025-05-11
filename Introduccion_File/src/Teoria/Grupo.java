package Teoria;

// Explicacion de la implementacion de la interfaz Serializable y para que sirve

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Grupo implements Serializable{
    private String nombre;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Grupo dam = new Grupo("1Dam");

        try {
            FileOutputStream fos = new FileOutputStream("Introduccion_File/src/archivo.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(dam);
            out.close();
            fos.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
