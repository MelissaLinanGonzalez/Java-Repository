import java.util.Scanner;
import java.lang.Math;

//Pedir los coeficientes de una ecuación de 2o grado, y muestre sus soluciones reales. SI no existen, debe indicarlo.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner coeficiente = new Scanner(System.in);
        System.out.print("Introduce el primer coeficiente: ");
        double a = coeficiente.nextDouble();
        System.out.print("Introduce el segundo coeficiente: ");
        double b = coeficiente.nextDouble();
        System.out.print("Introduce el último coeficiente: ");
        double c = coeficiente.nextDouble();

        if ((Math.pow(b,2) -4*a*c) < 0) {
            System.out.println("No es posible realizar la operación");
        } else {
            double resultado1 = (-b + Math.sqrt(Math.pow(b,2) -4*a*c))/ 2*a;
            double resultado2 = (-b - Math.sqrt(Math.pow(b,2) -4*a*c))/ 2*a;
            System.out.println("Los dos posibles resultados son: " + resultado1 + " y: " + resultado2);
        }
    }
}