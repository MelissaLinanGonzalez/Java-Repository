//Pedir 15 números y escribir la suma total
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        double n;
        double suma = 0;

        for (contador = 0; contador < 15 ; contador ++) {
            System.out.print("Introduce el nº" + (contador + 1) + " para obtener la suma total: ");
            n = entrada.nextDouble();
            suma += n;
        }
        System.out.println("La suma total es: " + suma);
    }
}
