import java.util.Scanner;

//Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo para mostrar 56: cincuenta y seis.

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce un número para enseñartelo escrito: ");
        int numero = n.nextInt();

        if(numero <=0 && numero <= 29){
            switch (numero){
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
                    System.out.println("cero"); break;
                case 8:
                    System.out.println("cero"); break;
                case 9:
                    System.out.println("cero"); break;
                case 10:
                    System.out.println("cero"); break;
                case 11:
                    System.out.println("cero"); break;
                case 12:
                    System.out.println("cero"); break;
                case 13:
                    System.out.println("cero"); break;
                case 14:
                    System.out.println("cero"); break;
                case 15:
                    System.out.println("cero"); break;
                case 16:
                    System.out.println("cero"); break;
                case 17:
                    System.out.println("cero"); break;
                case 18:
                    System.out.println("cero"); break;
                case 19:
                    System.out.println("cero"); break;
                case 20:
                    System.out.println("cero"); break;
                case 21:
                    System.out.println("cero"); break;
                case 22:
                    System.out.println("cero"); break;
                case 23:
                    System.out.println("cero"); break;
                case 24:
                    System.out.println("cero"); break;
                case 25:
                    System.out.println("cero"); break;
                case 26:
                    System.out.println("cero"); break;
                case 27:
                    System.out.println("cero"); break;
                case 28:
                    System.out.println("cero"); break;
                case 29:
                    System.out.println("cero"); break;

            }
        }

    }
}
