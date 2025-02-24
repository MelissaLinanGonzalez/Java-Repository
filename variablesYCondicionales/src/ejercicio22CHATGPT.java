import java.util.Scanner;

public class ejercicio22CHATGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 99) {
            System.out.println("El número debe estar entre 0 y 99.");
        } else {
            System.out.println("Número en texto: " + convertirNumeroATexto(numero));
        }

        scanner.close();
    }

    public static String convertirNumeroATexto(int numero) {
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

        if (numero < 10) {
            return unidades[numero];
        } else if (numero < 20) {
            return especiales[numero - 10];
        } else if (numero < 30) {
            return (numero == 20) ? "veinte" : "veinti" + unidades[numero - 20];
        } else {
            int decena = numero / 10;
            int unidad = numero % 10;
            return decenas[decena] + (unidad == 0 ? "" : " y " + unidades[unidad]);
        }
    }
}
