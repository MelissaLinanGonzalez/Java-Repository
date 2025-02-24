import java.util.Scanner;

//Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer número de la multiplicación: ");
        double n1 = entrada.nextDouble();

        System.out.print("Introduce el segundo nḿumero de la multiplicación: ");
        double n2 = entrada.nextDouble();

        double mult = n1 * n2;

        System.out.println("El resultado de la multiplicación de " + n1 + "x" + n2 + "=" + mult);
    }
}