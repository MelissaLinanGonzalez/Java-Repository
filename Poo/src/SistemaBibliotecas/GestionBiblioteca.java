package SistemaBibliotecas;

public class GestionBiblioteca {
    public static void main(String[] args) {
        Libro l1 = new Libro("Bibiana y su mundo", "Olaizola", "LO48445");
        Libro l2 = new Libro("Manolito gafotas", "Elvira Lindo", "MG58787");
        Libro l3 = new Libro("El árbol de la ciencia", "Pío Baroja", "AV78954");

        Usuario u1 = new Usuario("Pepe");
        System.out.println(u1);
        u1.pedirLibro(l1);
        u1.pedirLibro(l2);
        System.out.println(u1);
        u1.devolverLibro("Bibiana y su mundo");
        System.out.println(u1);

        System.out.println("");
        Usuario u2 = new Usuario("María");
        System.out.println(u2);
        u2.pedirLibro(l2);
        u2.pedirLibro(l1);
        u2.pedirLibro(l3);
        System.out.println(u2);
        System.out.println(u1);

    }
}
