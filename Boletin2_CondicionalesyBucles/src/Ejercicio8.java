//Pedir un número N y mostar todos los números del 1 a N.
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número para mostrarlos todos desde el 1 hasta el introducido: ");
        int n = entrada.nextInt();
        for (int i = 1; i < n + 1; i++) {
            if (i == n){
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }

        }
    }
}
