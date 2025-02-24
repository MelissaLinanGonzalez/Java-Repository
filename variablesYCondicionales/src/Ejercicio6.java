import java.util.Scanner;

// Pedir dos números y decir si uno es múltiplo del otro

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n1 = n.nextDouble();
        System.out.print("Introduce otro número para saber si es múltiplo del primero: ");
        double n2 = n.nextDouble();

        if(n1 % n2 == 0){
            System.out.println(n2 + " es múltiplo de " + n1);
        } else {
            System.out.println(n2 + " no es múltiplo de " + n1);
        }
    }
}
