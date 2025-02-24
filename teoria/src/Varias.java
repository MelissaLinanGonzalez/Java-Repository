import java.util.ArrayList;

public class Varias {
    public static boolean esPrimo(int x){
        for (int i = 2; i < x; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Devuelve verdadero si el número pasa como parámetro es capicúa y falso en caso contrario
     *
     * El num cap es aquel se lee igual de izq a der
     */

    /*public static boolean esCapicua(int x){

    }*/

    public static int siguientePrimo(int x){
        while (!esPrimo(++x)){
        }

        return x;
    }

    public static double potencia(int base, int exp){
        return Math.pow(base, exp);
    }

    public static int digitos(long x) {
        if (x < 0){
            x = -x;
        }
        if (x == 0){
            return 1;
        } else {
            int n = 0;
            while (x > 0){
                x = x /10;
                n++;
            }
            return n;
        }
    }

    /*public static long voltea(long x){
        if (x < 0){

        }
        ArrayList<Integer> digitos = new ArrayList<>();
        while (x > 0){
            digitos.add((int) (x % 10)); //Añado el último dígito al array
            x = x / 10; //reduzco el número
        }
        long volteado = 0;
        for (int i = 0; i < digitos.size(); i++){
            volteado = (volteado * 10) + digitos.get(i);
        }
    }*/

    public static void main(String[] args) {
        int x = 7;
        System.out.println(++x);

        siguientePrimo(x);
    }
}
