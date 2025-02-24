package Ejercicio2;

public class Lavadora extends Electrodomestico {
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia){
        super("Lavadora", marca, potencia);
        aguaCaliente = false;
    }
    // Con super se invoca el constructor de la clase padre, hace que se inicialice correctamente antes de añadir las propiedades de la clase hijo

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente){
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                ", marca: " + marca + '\'' +
                ", potencia=" + potencia +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }


}
