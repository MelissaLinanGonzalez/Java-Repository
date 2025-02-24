//Pedir números hasta que se introduzca uno negativo y calcular la media
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media = 0;
        double suma = 0;
        int contador = 0;
        int n;
        do {
            System.out.print("Introduce números para calcular su media (negativo para terminar): ");
            n = entrada.nextInt();
            suma += n;
            contador +=1;
        } while (n >=0);
        media = suma / contador;
        System.out.println("La media de los números introducidos es: " + media);
    }
}
