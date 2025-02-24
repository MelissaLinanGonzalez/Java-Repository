import java.lang.Math;
import java.util.Scanner;

//Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia para calcular su longitud: ");
        double radio = l.nextDouble();

        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}
