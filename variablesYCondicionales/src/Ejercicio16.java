import java.util.Scanner;

// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31. Sin años bisiestos.

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int anio = fecha.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = fecha.nextInt();
        System.out.print("Introduce el día: ");
        int dia = fecha.nextInt();

        if (anio <= 2024 && anio >= 1950){
            if (mes >= 1 && mes <= 12){
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if (dia >= 1 && dia <= 31){
                        System.out.println("Fecha correcta");
                    }else {
                        System.out.println("Día incorrecto");
                    }
                } else if (mes == 2) {
                    if (dia >= 1 && dia <= 28){
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Día incorrecto");
                    }
                } else {
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Día incorrecto");
                    }
                }
            } else {
                System.out.println("Mes incorrecto");
            }
        }
    }
}

