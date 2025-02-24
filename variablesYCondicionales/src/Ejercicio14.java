import java.util.Scanner;

//Pedir una nota de 0 a 10 y mostrarla de forma : Insuficiente, Suficiente, Bien...

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce una nota del 0 al 10: ");
        double nota = n.nextDouble();

        if (nota >= 0 && nota < 5){
            System.out.println("INSUFICIENTE");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("SUFICIENTE");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("BIEN");
        } else if (nota >=7 && nota < 9) {
            System.out.println("NOTABLE");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("SOBRESALIENTE");
        } else if (nota == 10) {
            System.out.println("MATRíCULA");
        } else {
            System.out.println("NOTA NO VÁLIDA");
        }
    }
}
