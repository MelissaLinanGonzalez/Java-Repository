import java.util.Scanner;

//Pedir tres números y mostrarlos ordenados de mayor a menor

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n1 = n.nextDouble();
        System.out.print("Introduce otro número: ");
        double n2 = n.nextDouble();
        System.out.print("Introduce un último número: ");
        double n3 = n.nextDouble();

        if (n1 > n2 && n2 > n3){
            System.out.println(n1 + ", " + n2 + ", " + n3);
        } else if (n1 > n3 && n2 < n3) {
            System.out.println(n1 + ", " + n3 + ", " + n2);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + ", " + n3 + ", " + n1);
        } else if (n3 > n2 && n2 > n1) {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        }else {
            System.out.println(n3 + ", " + n1 + ", " + n2);
        }
    }
}
