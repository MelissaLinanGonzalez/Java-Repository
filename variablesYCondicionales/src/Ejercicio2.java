import java.util.Scanner;
import java.lang.Math;

//Pedir el radio de un círulo y calcular su área. A=PI*r².

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = r.nextDouble();

        double area = Math.PI*(Math.pow(radio ,2));
        System.out.println("El área del cículo es " + area);
    }
}
