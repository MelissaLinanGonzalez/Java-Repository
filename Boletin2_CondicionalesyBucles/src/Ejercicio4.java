//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        int n;
        do {
            System.out.print("Introduce números (introduzca uno negativo para terminar): ");
            n = entrada.nextInt();
            lista.add(n);
            contador += 1;
        } while (n >= 0);
        System.out.println("El número total de valores introducidos son: " + contador);
        System.out.println("Los números introducidos son: " + lista);
    }
}
