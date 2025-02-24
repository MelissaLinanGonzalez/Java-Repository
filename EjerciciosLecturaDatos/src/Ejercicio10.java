import java.util.Scanner;

//Realiza un conversor de Kb a Mb

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Introduce los Kb que desea convertir a Mb: ");
        double Kb = kb.nextDouble();

        double Mb = Kb / 1000;

        System.out.println(Kb + "Kb, son: " + Mb + " Mb");

    }
}
