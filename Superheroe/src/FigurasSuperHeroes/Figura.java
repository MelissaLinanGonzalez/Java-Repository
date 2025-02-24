package FigurasSuperHeroes;

/* En esta clase se representa una figura de un supeheroe
* Con las siguientes propiedades:
* Codigo: Cada figura tiene un codigo identificativo formado por letras y números. Dos figuras distintas no tendrán el mismo código.
* Precio: Un double con el precio de la figura.
*
* Además, ya que la figura representa a un superheroe, será necesario que la clase Figura contenga un objeto de la calse superheroe que describa las caracteristicas de este.
* Por otro lado, para definir las dimensiones de la figura, la calse Figura contendrá un objeto de la clase Dimensión:
* Un objeto dimensiones de la clase Dimensiones que defina las dimensiones de la figura.
* Un objeto superheroe de la clase Superheroe que defina las características del superhéroe representado*/

public class Figura {
    private String codigo;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;

    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe){
        this.superheroe = superheroe;
    }

    @Override
    public String toString() {
        return "Figura (Código: " + codigo +
                ", Precio: " + precio +
                ", Dimensiones: [" + dimension +
                "], Superhéroe: [" + superheroe + "])";
    }

   /* public static void main(String[] args) {
        Dimension dim = new Dimension(20.0, 15.0, 10.0);

        Superheroe sh = new Superheroe();
        sh.setNombre("Iron Man");
        sh.setDescripcion("Un genio, millonario, playboy, filántropo con armadura de alta tecnología.");
        sh.setCapa(false);

        Figura figura = new Figura("F002", 20.50, dim, sh);

        System.out.println(figura);

    }*/
}
