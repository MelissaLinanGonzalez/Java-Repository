package SistemaBibliotecas;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private static int contadorId = 0;
    private int id;
    private ArrayList<Libro> prestamo;

    public Usuario(String nombre){
        this.nombre = nombre;
        contadorId ++;
        this.id = contadorId;
        this.prestamo = new ArrayList<>();
    }

    public void pedirLibro(Libro libro){
        if (libro.isDisponible()){
            libro.prestar();
            prestamo.add(libro);
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible");
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", prestamo=" + prestamo +
                '}';
    }

    public void devolverLibro(String titulo){
        for (Libro libros : prestamo){
            if (libros.getTitulo().equals(titulo)){
                libros.devolver();
                prestamo.remove(libros);
            } else {
                System.out.println("El libro que intenta devolver no se encuentra en su lista");
            }
        }
    }

}
