import java.util.Scanner;

// Pedir dos números y decir cuál es mayor o si son iguales

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n1 = n.nextDouble();
        System.out.print("Introduce otro número: ");
        double n2 = n.nextDouble();

        if (n1 > n2){
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n1 < n2) {
            System.out.println(n2 + " es nayor que " + n1);
        } else {
            System.out.println(n1 + " es igual que " + n2);
        }
    }
}
