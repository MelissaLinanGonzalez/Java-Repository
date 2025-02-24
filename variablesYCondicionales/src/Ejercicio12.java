import java.util.Scanner;

// Pedir un número entre el 0 y el 9.999 y mostrarlo con las cifras del revés

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999 para mostrarlo del revés: ");
        int n1 = n.nextInt();
        int unidades = 0;
        int decenas = 0;
        int centenas = 0;
        int unidadesmillar = 0;


        if (n1 >= 0 && n1 < 10) {
            System.out.println(n1);
        } else if (n1 >= 10 && n1 < 100) {
            unidades = n1 % 10;
            n1 = n1 / 10;
            decenas = n1 % 10;
            System.out.println(unidades * 10 + decenas);
        } else if (n1 >= 100 && n1 < 1000) {
            unidades = n1 % 10;
            n1 = n1 / 10;
            decenas = n1 % 10;
            n1 = n1 / 10;
            centenas = n1 % 10;
            System.out.println(unidades * 100 + decenas * 10 + centenas);
        } else if (n1 >= 1000 && n1 < 10000) {
            unidades = n1 % 10;
            n1 = n1 / 10;
            decenas = n1 % 10;
            n1 = n1 / 10;
            centenas = n1 % 10;
            n1 = n1 / 10;
            unidadesmillar = n1 % 10;
            System.out.println(unidades * 1000 + decenas * 100 + centenas  * 10 + unidadesmillar);
        } else {
            System.out.println("Número fuera de rango");
        }
    }
}
