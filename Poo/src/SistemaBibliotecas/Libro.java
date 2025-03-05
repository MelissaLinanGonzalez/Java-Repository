package SistemaBibliotecas;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar(){
        if (this.disponible == true){
            System.out.println("El libro " + this.titulo + " ha sido prestado correctamente.");
            this.disponible = false;
        } else {
            System.out.println("El libro " + this.titulo + " ya ha sido prestado, busque otro.");
        }
    }

    public void devolver(){
        if (this.disponible == false){
            System.out.println("Libro " + this.titulo + " devuelto correctamente.");
            this.disponible = true;
        } else {
            System.out.println("Es imposible devolver un libro que no ha sido prestado ¬¬ ...");
        }
    }

    @Override
    public String toString() {
        return  "{titulo='" + titulo + ", autor='" + autor + ", isbn='" + isbn + "}";
    }
}
