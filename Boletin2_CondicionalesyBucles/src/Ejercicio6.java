//Pedir números hasta que se teclee un 0, mostar la suma de todos los números introducidos.
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        double n;
        do {
            System.out.print("Introduce números para obtener la suma total (0 para salir): ");
            n = entrada.nextDouble();
            suma += n;
        }while (n != 0);
        System.out.println("La suma total es: " + suma);
    }
}
