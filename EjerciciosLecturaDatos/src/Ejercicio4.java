import java.util.Scanner;

//Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double n1 = num.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double n2 = num.nextDouble();

        double sum = n1 + n2;
        double resta = n1 - n2;
        double mult = n1 * n2;
        double division = n1 / n2;
        System.out.println("suma de " + n1 + " y " + n2 + "= " + sum);
        System.out.println("resta de " + n1 + " y " + n2 + "= " + resta);
        System.out.println("multiplicación de " + n1 + " y " + n2 + "= " + mult);
        System.out.println("división de " + n1 + " y " + n2 + "= " + division);
    }
}
