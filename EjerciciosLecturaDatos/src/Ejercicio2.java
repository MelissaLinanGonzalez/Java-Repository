import java.util.Scanner;

//Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser introducida por teclado

public class Ejercicio2 {
    public static void main(String[] args) {
        double euros;

        Scanner euro = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros que desea convertir en pesetas: ");
        euros = euro.nextDouble();

        double pesetas = euros * 166.386;

        System.out.println(euros + " euros, son " + pesetas + " pesetas");
    }
}
