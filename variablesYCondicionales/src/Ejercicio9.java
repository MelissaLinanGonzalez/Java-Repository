import java.util.Scanner;

//Pedir dos números y mostrarlos ordenados de mayor a menor.

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n1 = n.nextDouble();
        System.out.print("Introduce otro número: ");
        double n2 = n.nextDouble();

        if (n1 < n2){
            System.out.println(n2 + ", " + n1);
        } else {
            System.out.println(n1 + ", " + n2);
        }
    }
}
