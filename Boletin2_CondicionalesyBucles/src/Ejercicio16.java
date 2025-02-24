//Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número para mostrar su tabla de multiplicar entre 0 y 10: ");
        n = entrada.nextInt();

        if (n > 0 && n <= 10){
            for (int i = 0; i <= 10; i++) {
                System.out.println(n + "*" + i + "= " + n * i);
            }
        } else {
            System.out.println("Número fuera de rango");
        }
    }
}
