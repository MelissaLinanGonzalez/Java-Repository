import java.util.Scanner;

//Ídem que el ejercicio 17, suponienod que cada mes tiene un número distinto de días (suponiendo que febrero tiene siempre 28 días.

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        int dia = fecha.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = fecha.nextInt();
        System.out.print("Introduce el año: ");
        int anio = fecha.nextInt();

        if (mes == 2){
            if (dia >= 1 && dia < 28){
                dia += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            } else if (dia == 28){
                dia = 1;
                mes += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            }
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
            if (dia >= 1 && dia <= 30){
                dia += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            } else if (dia == 31){
                dia = 1;
                mes += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia < 30){
                dia += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            } else if (dia == 30) {
                dia = 1;
                mes += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            }
        } else if (mes == 12) {
            if (dia >= 1 && dia < 31){
                dia += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            } else if (dia == 31) {
                dia = 1;
                mes = 1;
                anio += 1;
                System.out.println("El día siguiente corresporne a: Día " + dia + " del mes " + mes + " del año: " + anio);
            }
        }
    }
}
