import java.util.Scanner;

// Pedir un número e indicar si es positivo o negativo

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número para determinar si es positvio, negativo o cero: ");
        double n1 = n.nextDouble();

        if(n1 < 0){
            System.out.println("El número es negativo");
        } else if (n1 == 0) {
            System.out.println("El número introducido es 0");
        } else {
            System.out.println("El número introducido es positivo");
        }
    }
}
