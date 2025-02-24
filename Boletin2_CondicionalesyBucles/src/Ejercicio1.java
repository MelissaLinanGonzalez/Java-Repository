//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número para obtener su cuadrado: ");
            n = entrada.nextInt();
            int cuadrado =(int) (Math.pow(n,2));
            System.out.println("El cuadrado de " + n + " es: " + cuadrado);
        } while (n>0);
    }
}