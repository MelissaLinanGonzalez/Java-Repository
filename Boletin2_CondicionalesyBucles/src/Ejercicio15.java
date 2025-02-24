//Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden más de 1.75.

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int edad;
        int sumaEdad = 0;
        float altura;
        float sumaAltura = 0;
        int contadorEdad =0;
        int contadorAltura = 0;
        int contadorMayorEdad = 0;
        int contadorAlturaSuperior = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i < 6 ; i++) {
            System.out.print("Introduce la edad del alumno " + i + ": ");
            edad = entrada.nextInt();
            System.out.print("Introduce su altura: ");
            altura = entrada.nextFloat();
            sumaEdad += edad;
            contadorEdad += 1;
            sumaAltura += altura;
            contadorAltura += 1;
            if (edad >= 18) {
                contadorMayorEdad += 1;
            }
            if (altura >= 1.75){
                contadorAlturaSuperior += 1;
            }

        }
        int mediaEdad = sumaEdad / contadorEdad;
        float mediaAltura = sumaAltura /contadorAltura;
        System.out.println("La edad media de los alumnos es: " + mediaEdad);
        System.out.println("La altura media de los alumnos es: " + mediaAltura);
        System.out.println("La cantidad de alumnos mayores de 18 es: " + contadorMayorEdad);
        System.out.println("La cantidad de alumnos con una altura mayor a 1.75 es: " + contadorAlturaSuperior);
    }
}
