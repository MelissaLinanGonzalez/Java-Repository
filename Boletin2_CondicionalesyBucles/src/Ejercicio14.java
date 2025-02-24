//Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de 1.000€

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
       double sueldo;
       double suma = 0;
       int contadorSup1000 = 0;

       Scanner entrada = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            System.out.print("Introduce el sueldo " + i + ": ");
            sueldo = entrada.nextDouble();
            suma += sueldo;
            if (sueldo > 1000){
                contadorSup1000 +=1;
            }
        }
        System.out.println("La suma total de los sueldos es: " + suma + "€");
        System.out.println("El número de sueldos superior a 1000 es:" + contadorSup1000);
    }
}
