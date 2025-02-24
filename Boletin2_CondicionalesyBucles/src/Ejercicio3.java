//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número para saber si es par o impar (Introduzca 0 para terminar): ");
            n = entrada.nextInt();
            if (n % 2 == 0){
                System.out.println(n + " es PAR");
            } else {
                System.out.println(n + " es IMPAR");
            }
        }while (n != 0);
    }
}
