import java.util.Scanner;

// Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. Suponer que todos los meses tienen 30 días.

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        int dia = fecha.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = fecha.nextInt();
        System.out.print("Introduce el año: ");
        int anio = fecha.nextInt();

        if (mes >= 1 && mes < 12){
            if (dia >= 1 && dia < 30){
                dia += 1;
                System.out.println("El día siguiente corresponde a: Día " + dia + " del mes " + mes + " del año " + anio);
            } else if (dia == 30) {
                dia = 1;
                mes += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            }
        } else if (mes == 12) {
            if (dia >= 1 && dia < 30){
                dia += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            } else if (dia == 30) {
                dia = 1;
                mes = 1;
                anio += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            }
        }

    }
}
