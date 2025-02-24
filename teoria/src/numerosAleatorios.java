import java.util.Scanner;
//NUMEROS ALEATORIOS

public class numerosAleatorios {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 50 y 60");
        System.out.println("Sin llegar a 10 (con decimales):");

        for (int i = 1; i <= 20; i++) {
            System.out.println((int)(Math.random() * 11) + 50);
        }
    }
}
