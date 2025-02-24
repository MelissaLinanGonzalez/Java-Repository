package FigurasSuperHeroes;

/* La empresa vende a veces colecciones de figuras, que básicamente son conjuntos de figuras con una temática relacionada. Por ejemplo una colección "El hombre Murciélago" que consta de una serie de figuras relacionadas con Batman, o una colección "Marvel", con figuras de superhéroes de Marvel, etc...
* Las propiedades:
* Las colecciones estarán descritas por la clase Colección, que tiene las siguientes propiedades:
* nombreColeccion, que será el nombre de la colección ("El hoombre Murciélago", "Marvel", etc...)
* Un objeto listaFiguras, que será un ArrayList que contendrá las distintas figuras que forman la colección.*/

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion){
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public void introducirFigura(Figura figura){
        this.listaFiguras.add(figura);
    }

    public void subirPrecio(double cantidad, String codigo){
        for (Figura figura : listaFiguras){
            if (figura.getCodigo().equals(codigo)){
                figura.setPrecio(figura.getPrecio() + cantidad);
                return;
            }
        }
        System.out.println("Figura con código " + codigo + " no existe.");
    }

    public String toString(){
        return "Las figuras de la colección: " + nombreColeccion + " son las siguientes: " + listaFiguras;
    }

    public void conCapa(){
        for (Figura figura : listaFiguras){
            if (figura.getSuperheroe().getCapa() == true){
                System.out.println(figura.getSuperheroe().getNombre() + " tiene capa.");
            }
        }
    }

    public Figura masValioso() {
        if (listaFiguras.isEmpty()) {
            return null;
        }

        Figura masValiosa = listaFiguras.get(0);
        for (Figura figura : listaFiguras) {
            if (figura.getPrecio() > masValiosa.getPrecio()) {
                masValiosa = figura;
            }
        }
        return masValiosa;
    }

    public double getValorColeccion() {
        double valorTotal = 0;
        for (Figura figura : listaFiguras) {
            valorTotal += figura.getPrecio();
        }
        return valorTotal;
    }

}
