import java.util.Scanner;

// Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999: ");
        int n1 = n.nextInt();
        if (0 > n1 && n1 > 9999){
            System.out.println("El número introducido está fuera de rango");
        } else if (n1 >=0 && n1 < 10){
            System.out.println("El número tiene una cifra");
        } else if (n1 >= 10 && n1 < 100) {
            System.out.println("El número tiene dos cifras");
        } else if (n1 >= 100 && n1 < 1000) {
            System.out.println("El número tiene tres cifras");
        } else if (n1 >= 1000 && n1 < 10000) {
            System.out.println("El número tiene cuatro cifras");
        }
    }
}
