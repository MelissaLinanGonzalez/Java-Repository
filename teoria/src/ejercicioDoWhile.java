/* bucle do-while que se termina cuando se introduce un número impar*/
import java.util.Scanner;

public class ejercicioDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero ;
        do {
            System.out.print("Dime un número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El " + numero + " es par");
            } else {
                System.out.println("NO MOSTRAMOS LOS IMPARES");
            }
        } while (numero % 2 == 0);
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}
/* */