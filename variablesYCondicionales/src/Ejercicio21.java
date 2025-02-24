import java.util.Scanner;

//Pedir una nota numérica entera entre 0 y 10 y mostrar dicha nota de la forma: cero, uno, dos, tres...

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        int nota = n.nextInt();

        switch (nota){
            case 0:
                System.out.println("cero"); break;
            case 1:
                System.out.println("uno"); break;
            case 2:
                System.out.println("dos"); break;
            case 3:
                System.out.println("tres"); break;
            case 4:
                System.out.println("cuatro"); break;
            case 5:
                System.out.println("cinco"); break;
            case 6:
                System.out.println("seis"); break;
            case 7:
                System.out.println("siete"); break;
            case 8:
                System.out.println("ocho"); break;
            case 9:
                System.out.println("nueve"); break;
            case 10:
                System.out.println("diez"); break;
        }
    }
}
