import java.util.Scanner;

//Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner pesetas = new Scanner(System.in);
        System.out.print("Introduce la cantidad de pesetas que desea convertir a euros: ");
        double peseta = pesetas.nextDouble();

        double euros = peseta / 166.386;

        System.out.println(peseta + " pesetas, son " + euros + " euros");
    }
}
