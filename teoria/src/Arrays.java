/*Arrays de una dimensión*/
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int [] n ; // int [] n = new int [4] tmb se puede poner de esta manera.
        n = new int[4];

        //PUEDE SER TMB DE CHAR
        char [] caracter = new char [6];
        caracter[0]= 'R';


        n[0] = 23;   // int [] n = {8, 5, 6, 56, 5}
        n[1] = -33;
        n[2] = 45;
        n[3] = -87;
        System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3]);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
