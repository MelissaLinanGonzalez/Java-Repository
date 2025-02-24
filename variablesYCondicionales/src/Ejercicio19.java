import java.util.Scanner;

//Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo que todos los meses tienen 30 días

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduce el dia de la primera fecha: ");
        int dia1 = fecha.nextInt();
        System.out.print("Introduce el mes de la primera fecha: ");
        int mes1 = fecha.nextInt();
        System.out.print("Introduce el año de la primera fecha: ");
        int anio1 = fecha.nextInt();
        System.out.print("Introduce el día de la segunda fecha: ");
        int dia2 = fecha.nextInt();
        System.out.print("Introduce el mes de la segunda fecha: ");
        int mes2 = fecha.nextInt();
        System.out.print("Introduce el año de la  segunda fecha: ");
        int anio2 = fecha.nextInt();

        int totaldias1 = anio1*365 + mes1 *30 + dia1;
        int totaldias2 = anio2*365 + mes2 *30 + dia2;
        int diferenciadias = totaldias2 - totaldias1;
        System.out.println("La diferencia de dias es: " + diferenciadias);
    }
}
