package FigurasSuperHeroes;

public class Main {
    public static void main(String[] args) {
        Superheroe s1 = new Superheroe("batman"); //Se crea un superheroe
        Superheroe s2 = new Superheroe("superman");
        Superheroe s3 = new Superheroe("ironman");

        Dimension d1 = new Dimension(12.5, 25, 14); //Se crean las dimensiones
        Dimension d2 = new Dimension(13.5, 26, 15);
        Dimension d3 = new Dimension(14.5, 27, 15);

        Figura f1 = new Figura("A384", 24.5, d1, s1); //Se crean las figuras
        Figura f2 = new Figura("B123", 18.20, d2, s2);
        Figura f3 = new Figura("C233", 30.20, d3, s3);

        Coleccion c1 = new Coleccion("superheroes"); //Se crean las colecciones
        Coleccion c2 = new Coleccion("pepes");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s2.setCapa(true); //Se modifica el valor original de la capa "FALSE" para que sea "TRUE"
        s2.setDescripcion("Vengo de otro planeta y mi debilidad es la criptonita"); //Se añade una descripcion al superheroe
        System.out.println(s2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        c1.introducirFigura(f1); //Se introducen figuras a las colecciones creadas
        c2.introducirFigura(f2);
        c2.introducirFigura(f3);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c2.getValorColeccion());
        System.out.println(c2.masValioso());

    }
}
