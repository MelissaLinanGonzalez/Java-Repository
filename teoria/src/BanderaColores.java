/* Programa que genere una bandera de colores aleatorios empleando un array de caneda de caracteres para almacenar colores*/
import java.util.Scanner;

public class BanderaColores {
    public static void main(String[] args) {
        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        Scanner bandera = new Scanner(System.in);
        System.out.print("Introduce cuantas franjas tiene tu bandera: ");
        int franjas = bandera.nextInt();

        System.out.println("--------------");
        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int) (Math.random() * color.length)]);
            System.out.println("--------------");
        }
    }
}
