import java.util.Scanner;

//Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12€/h

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner nomina = new Scanner(System.in);
        String dia = "";
        double horas = 0;
        for (int i = 1; i < 8; i++) {
            if (i == 1)
                dia = "lunes"; 
            if (i == 2)
                dia = "martes";
            if (i == 3)
                dia = "miércoles";
            if (i == 4)
                dia = "jueves";
            if (i == 5)
                dia = "viernes";
            if (i == 6)
                dia = "sábado";
            if (i == 7)
                dia = "domingo";
            System.out.print("Introduce las horas trabajadas del " + dia + ": ");
             horas = horas + nomina.nextDouble();
            
        }
        System.out.println("Total horas trabajadas: " + horas);
        System.out.println("Total de la nómina: " + horas * 12 + " euros");
    }
}
