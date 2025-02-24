import java.util.Scanner;

//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduce el número de mes: ");
        int mes = fecha.nextInt();
        System.out.print("Introduce el número de día: ");
        int dia = fecha.nextInt();
        System.out.print("Introduce el año: ");
        int anio = fecha.nextInt();

        if (mes >= 1 && mes <= 12){
            if (dia >= 1 && dia <= 30){
                System.out.println("La fecha es correcta");
            }else {
                System.out.println("El día introducido no es correcto");
            }
        }else {
            System.out.println("El mes introducido no es correcto");
        }
    }
}
