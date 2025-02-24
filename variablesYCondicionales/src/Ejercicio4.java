import java.util.Scanner;

// Pedir dos números y decir si son iguales o no

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n1 = n.nextDouble();

        System.out.print("Introduce otro número: ");
        double n2 = n.nextDouble();

        if (n1 == n2){
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }
    }
}
