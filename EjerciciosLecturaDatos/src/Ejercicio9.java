import java.util.Scanner;

//Realiza un conversor de Mb a Kb

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Introduce la cantidad de Mb que desea convertir a Kb: ");
        double Mb = mb.nextDouble();

        double Kb = Mb * 1000;
        System.out.println(Mb + "Mb son: " + Kb + " Kb");
    }
}
