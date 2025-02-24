//Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número para saber si es negativo o positivo (o 0 para salir): ");
            n = entrada.nextInt();
            if (n < 0) {
                System.out.println(n + " es negativo");
            } else if (n > 0) {
                System.out.println(n + " es positvo");
            }
        } while (n != 0);
    }
}
