package FigurasSuperHeroes;

// Clase superheroe, en la que se definen las caracteristicas de un superheroe. Las propiedades son:
/*Nombre (nombre del superheroe)
* Descripcion (cadena para describir brevemente su aspecto
* Capa (booleano que indica si el superheroe lleva o no capa*/

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre){
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public boolean getCapa(){
        return capa;
    }

    public void setCapa(boolean capa){
        this.capa = capa;
    }

    public String tieneCapa(){
        if (capa == true){
            return "tengo capa";
        } else {
            return "no tengo capa";
        }
    }

    public String toString(){
        return "Soy un Superheroe, me llamo " + nombre + ". Mi descripción es la siguiente: " + descripcion + " y " + tieneCapa();
    }

   /* public static void main(String[] args) {
        Superheroe s1 = new Superheroe();
        System.out.println(s1);
    }*/
}
