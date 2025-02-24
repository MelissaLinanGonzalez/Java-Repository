import java.util.Scanner;

//Escribe un programa que calcule el área de un triángulo

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo para calcular su área: ");
        double base = triangulo.nextDouble();
        System.out.print("Introduce la altura del triángulo para calcular su área: ");
        double altura = triangulo.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo de base y altura introducidas es: " + area);
    }
}
