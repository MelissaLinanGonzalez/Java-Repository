//Realizar un juego para adivinar in número. Para ello perdir un número N, y luego ir pidiendo números indicando "mayor" o "menor" segúnsea mayor o menor con respecto a N. EL proceso termina cuadno el usuario acierta.
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número a buscar: ");
        int numeroSecreto = entrada.nextInt();
        int n;
        do {
            System.out.print("Introduce un número para intentar adivinar el número secreto: ");
            n = entrada.nextInt();
            if (n < numeroSecreto){
                System.out.println("El número introducido es MENOR que el secreto");
            } else if (n > numeroSecreto) {
                System.out.println("El número introducido es MAYOR que el secreto");
            }
        }while (n != numeroSecreto);
        System.out.println("¡BIEN! HAS ADIVINADO EL NÚMERO " + numeroSecreto);
    }
}
