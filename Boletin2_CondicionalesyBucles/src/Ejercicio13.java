// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio13 {
    public static void main(String[] args) {
        int contadorImpar = 0;
        int contadorPar = 0;
        int sumaPar = 0;
        int sumaImpar = 0;
        double mediaImpar = 0;
        double mediaPar = 0;
        int numero0 = 0;
        int n;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el nº" + (i+1) + " para obtener las medias y/o la cantidad de 0 introducidos: ");
            n = entrada.nextInt();
            if(n % 2 == 0){
                contadorPar += 1;
                sumaPar += n;
                pares.add(n);
            } else if (n % 2 != 0) {
                contadorImpar += 1;
                sumaImpar += n;
                impares.add(n);
            } else if (n == 0) {
                numero0 += 1;
            }
        }
        mediaPar = sumaPar / contadorPar;
        mediaImpar = sumaImpar / contadorImpar;
        System.out.println("Los números pares son: " + pares);
        System.out.println("La media de los números pares: " + mediaPar);
        System.out.println("Los números impares son: " + impares);
        System.out.println("La media de los números impares: " + mediaImpar);
        System.out.println("La cantidad de ceros introducidos: " + numero0);
    }
}
