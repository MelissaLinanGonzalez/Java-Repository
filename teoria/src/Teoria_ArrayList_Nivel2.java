import java.util.ArrayList;

public class Teoria_ArrayList_Nivel2 {
    public static void main(String[] args) {
        //Realizar operaciones de:
        // Iteración y manipulación de elementos

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Cereza");
        frutas.add("Aceituna");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta " + (i+1) + ": " + frutas.get(i));
        }
        for (String item: frutas) {
            System.out.println(item);
        }

        //Eliminar un elemento:
        frutas.remove(1);
        for (String item: frutas) {
            System.out.println(item);
        }
        //ArrayList de enteros donde se emplee lo siguiente:
        // Buscar un elemento
        // Clonar o copiar el ArrayList
        // Vaciar o limpiar los elementos del ArrayList

        System.out.println();
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(7);
        numeros.add(85);
        numeros.add(0);
        numeros.add(4);

        for (Integer n: numeros) {
            System.out.println(n);
        }

        System.out.println("La lista contiene el número 5? " + numeros.contains(5));
        ArrayList<Integer> numeros2 = numeros; // =(ArrayList<Integer>)numeros.clone
        for (Integer n2: numeros2){
            System.out.println("Lista clonada: " + n2);
        }

        //Limpiar la lista original
        numeros.clear();
        System.out.println(numeros);
    }
}
