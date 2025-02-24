import java.util.Scanner;

//Escribe un programa que calcule el área de un rectángulo

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner rectangulo = new Scanner(System.in);
        System.out.print("Introduce la altura del rectángulo para calcular su área: ");
        double altura = rectangulo.nextDouble();
        System.out.print("Introduce la base del rectángulo para calcular su área: ");
        double base = rectangulo.nextDouble();

        double area = altura * base;

        System.out.println("El área del rectágulo de base y altura introducidas es: " + area);
    }
}
