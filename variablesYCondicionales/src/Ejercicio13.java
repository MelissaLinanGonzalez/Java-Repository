import java.util.Scanner;

// Pedir un número entre 0 y 9999 y decir si es capicúa

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999 para saber si es capicúa:  ");
        int n1 = n.nextInt();
        int unidades = 0;
        int decenas = 0;
        int centenas = 0;
        int unidadesmillar = 0;
        int numero_inverso = 0;
        int n2 = n1;

        if (n1 >= 0 && n1 < 10) {
            System.out.println(n1);
        } else if (n1 >= 10 && n1 < 100) {
            unidades = n1 % 10;
            n1 = n1 / 10;
            decenas = n1 % 10;
            numero_inverso = unidades * 10 + decenas;
            if (numero_inverso == n2){
                System.out.println(n2 + " es capicúa");
            } else {
                System.out.println(n2 + " no es capicúa");
            }
        } else if (n1 >= 100 && n1 < 1000) {
            unidades = n1 % 10;
            n1 = n1 / 10;
            decenas = n1 % 10;
            n1 = n1 / 10;
            centenas = n1 % 10;
            numero_inverso= unidades * 100 + decenas * 10 + centenas;
            if (numero_inverso == n2){
                System.out.println(n2 + " es capicúa");
            } else {
                System.out.println(n2 + " no es capicúa");
            }
        } else if (n1 >= 1000 && n1 < 10000) {
            unidades = n1 % 10;
            n1 = n1 / 10;
            decenas = n1 % 10;
            n1 = n1 / 10;
            centenas = n1 % 10;
            n1 = n1 / 10;
            unidadesmillar = n1 % 10;
            numero_inverso = unidades * 1000 + decenas * 100 + centenas  * 10 + unidadesmillar;
            if (numero_inverso == n2){
                System.out.println(n2 + " es capicúa");
            } else {
                System.out.println(n2 + " no es capicúa");
            }
        } else {
            System.out.println("Número fuera de rango");
        }
    }
}
