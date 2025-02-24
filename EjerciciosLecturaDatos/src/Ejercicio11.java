import java.util.Scanner;

//Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double examen1 = nota.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double trimestre = nota.nextDouble();
        double examen2;
        examen2 = (trimestre - examen1 *0.4) / 0.6;

        System.out.println("Para tener un " + trimestre + " en el trimestre, necesitas sacar un " + examen2 + " en el segundo examen.");
    }
}
