//Un ArrayList es lo que conocíamos en python como LISTA
//Un ArrayList es una estructura de datos en Java que permite almacenar elementos de forma dinámica.
//Ventaja sobre Array: NO necesito definir su tamaño de antemano.

import java.util.ArrayList;
import java.util.Arrays;

public class Teoria_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        // Agregar elementos al ArrayList:
        nombres.add("Ester");
        nombres.add("Juan");
        nombres.add("Ricardo");

        String[] n = {"Pepe", "Juan"};

        System.out.println("Lista de nombres: " + nombres);
        System.out.println(Arrays.toString(n)); //otra manera de mostrar los elementos de un array estatico aparte del for

        //Acceder a un elemento específico
        System.out.println("Primer nombre: " + nombres.get(0));
        System.out.println("Segundo nombre: " + nombres.get(1));

        //Cambiar un elemento
        nombres.set(1,"Paco");
        System.out.println(nombres.get(1));

        /*
        * add(): Metodo para agregar items
        * get(): Permite acceder a un elemento por su index
        * set(): Cambia un elemento en una posición específica
        * */
    }
}
