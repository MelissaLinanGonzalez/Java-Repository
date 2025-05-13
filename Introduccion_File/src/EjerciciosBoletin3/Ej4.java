package EjerciciosBoletin3;

/*Nombre y apellidos
* Implementa un programa que genere aleatoriamente nombres de personas (combinando nombres y apellidos de 'usa_nombres.txt' y 'usa_apellidos'.txt). Se le pedirá al usuario cuántos nombres de personas desea generar y a qué archivo añadirlos (por ejemplo 'usa_personas.txt').*/

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        // Pedimos al usuario cuántos nombres quiere generar
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce cuántos nombres deseas generar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();


    }
}
