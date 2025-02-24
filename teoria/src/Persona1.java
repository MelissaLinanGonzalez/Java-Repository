

import java.util.Scanner;

public class Persona1 {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;

    public Persona1(String nombre, String apellido, int edad, double altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    //Métodos getter y setter para introducir parámetros. Esto hay que hacerlos siempre. Los get son para obtener los valores de los atributos y los set para sobreescribirlos.

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String nombre){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad (int edad) {
        if (edad >=0){
            this.edad = edad;
        } else {
            System.out.println("Edad no válidad");
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura (double altura) {
        if (altura >=0){
            this.altura = altura;
        } else {
            System.out.println("Altura no válidad");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = entrada.next();
        System.out.println("Introduce el apellido: ");
        String apellido = entrada.next();
        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();
        System.out.println("Introduce la altura: ");
        double altura = entrada.nextDouble();

        Persona1 persona2 = new Persona1(nombre, apellido, edad, altura);

    }
}
