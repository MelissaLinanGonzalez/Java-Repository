import java.util.Scanner;

//Escribe un programa que calcule el total de una factura a partir de la base imponible

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner factura = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double baseImponible = factura.nextDouble();
        System.out.print("Introduce el IVA de la factura: ");
        double iva = factura.nextDouble();

        double total = baseImponible + (baseImponible * iva/100);

        System.out.println("El total de la factura es: " + total);
    }
}
