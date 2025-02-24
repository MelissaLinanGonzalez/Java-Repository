//Diseñar un programa que muestre el producto de los 10 primeros números impares

public class Ejercicio11 {
    public static void main(String[] args) {
        //ponemos un bucle for hasta 20 porque tiene que haber 10 números impares, que serían 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
        int mult = 1;

        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                mult *= i;
            }
        }
        System.out.println("El resultado de la multiplicación es: " + mult);
    }
}
