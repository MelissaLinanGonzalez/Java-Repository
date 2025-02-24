package FigurasSuperHeroes;

/* Define un grupo de medidas, con las siguientes propiedades:
* Alto. Medida correspondiente al alto del objeto
* Ancho. Medida correspondiente al ancho del objeto
* Profundidad. Medida correspondiente a la profundidad del objeto*/
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public Dimension(){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getAlto(){
        return alto;
    }
    public double getAncho(){
        return ancho;
    }
    public double getProfundidad(){
        return profundidad;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setProfundidad(double profundidad){
        this.profundidad = profundidad;
    }

    public double getVolumen() {
        return alto * ancho * profundidad;
    }

    public String toString(){
        return "La altura es: " + alto + ". El ancho es: " + ancho + ". La profundidad es: " + profundidad + ". El volumen es: " + getVolumen();
    }

   /* public static void main(String[] args) {
        Dimension d1 = new Dimension();
        System.out.println(d1);
    }*/
}
