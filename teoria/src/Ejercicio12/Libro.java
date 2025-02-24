package Ejercicio12;

public class Libro extends Publicacion implements Prestable{

    private boolean prestado = false;

    public Libro(String isbn, String titulo, int anio){
        super(isbn, titulo, anio);
    }

    @Override
    public void presta(){
        if (this.prestado){
            System.out.println("El libro está prestado");
        } else {
            this.prestado = true;
            System.out.println("Libro entregado...");
        }
    }

    @Override
    public void devuelve(){
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado(){
        return this.prestado;
    }

    @Override
    public String toString(){
        return super.toString() + "libro" + " prestado = " + prestado;
    }
}
