import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Listas {
    public static void main(String[] args) {
        List <String> miLista = new ArrayList <>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        //Permite elementos duplicados y mantienen un orden
        for (String elemento : miLista){ //Si no se pone el tipo de dato en la creacion del arraylist, por defecto son objetos
            System.out.println("Dia de la semana: " + elemento);
        }

        // Funciones lambda (funcion anonima de un codigo muy compacto)
        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        //Se sabe que va recorrer todos los elementos de la lista y los imprime, importante poner :: para poder acceder al println
        miLista.forEach(System.out::println);

        List <String> nombres = Arrays.asList("Pedro", "Amparo", "Ismael");
        System.out.println("\nLista de nombres");
        nombres.forEach(System.out::println);
    }
}
