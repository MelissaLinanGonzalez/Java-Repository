import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        System.out.println("Genera al azar un piedra papel o tijeras: ");

        switch ((int)(Math.random() * 3)) {
            case 0:
                System.out.println("Piedra"); break;
            case 1:
                System.out.println("Papel"); break;
            case 2:
                System.out.println("Tijeras"); break;
        }
    }
}
