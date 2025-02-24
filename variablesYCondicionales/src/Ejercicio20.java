import java.util.Scanner;

//Pedir una hora de la forma hora, minutos y segundos y mostrar la hora en el segundo siguiente.

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Introduce las horas: ");
        int hora = h.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = h.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = h.nextInt();

        if (hora >= 0 && hora < 24){
            if (minutos >= 0 && minutos < 60){
                if (segundos >= 0 && segundos < 60){
                    segundos += 1;
                    System.out.println(hora + "h " + minutos + "m " + segundos + "s");
                } else if (segundos == 60) {
                    segundos = 0;
                    minutos += 1;
                    System.out.println(hora + "h " + minutos + "m " + segundos + "s");
                }
            } else if (minutos == 60) {
                segundos = 0;
                minutos = 0;
                hora += 1;
                System.out.println(hora + "h " + minutos + "m " + segundos + "s");
            }
        } else if (hora == 24) {
            segundos = 0;
            minutos = 0;
            hora = 0;
            if (segundos >= 0 && segundos < 60){
                segundos += 1;
                System.out.println(hora + "h " + minutos + "m " + segundos + "s");
            } else if (segundos == 60) {
                segundos = 0;
                minutos += 1;
                System.out.println(hora + "h " + minutos + "m " + segundos + "s");
            }
        }
    }
}
