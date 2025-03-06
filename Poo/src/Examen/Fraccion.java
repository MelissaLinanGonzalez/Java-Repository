package Examen;

/*
* 1. Escribir una clase para representar fracciones. La clase tendrá dos atributos tipo int: num (numerador)
* y den (denominador).
* 2. La clase debe contener los constructores y métodos adecuados para que el main dado funcione.*/

public class Fraccion {
    private int num;
    private int den;

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
        if (den == 0){
            System.out.println("No se puede introducir un denominador que sea 0");
        }
    }

    public Fraccion(){
        this.num = 0;
        this.den = 1;
    }

    public Fraccion(int num){
        this.num = num;
        this.den = 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }


    public Fraccion sumar(Fraccion fracion){
        int numNuevo =  (this.num * fracion.den) + (this.den * fracion.num);
        int demNuevo = this.den * fracion.den;
        return new Fraccion(numNuevo,demNuevo);
    }

    public Fraccion restar(Fraccion fraccion){
        int numNuevo = (this.num * fraccion.den) - (this.den * fraccion.num);
        int demNuevo = this.den * fraccion.den;
        return new Fraccion(numNuevo, demNuevo);
    }

    public Fraccion multiplicar(Fraccion fraccion){
        int numNuevo = this.num * fraccion.num;
        int demNuevo = this.den * fraccion.den;
        return new Fraccion(numNuevo, demNuevo);
    }

    public Fraccion dividir(Fraccion fraccion){
        int numNuevo = this.num * fraccion.den;
        int demNuevo = this.den * fraccion.num;
        return new Fraccion(numNuevo, demNuevo);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}
