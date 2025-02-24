//Pedir un número y calcular su factorial
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número para obtener su factorial: ");
        int n = entrada.nextInt();
        double factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
