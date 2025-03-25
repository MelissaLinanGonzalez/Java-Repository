import java.util.ArrayList;
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
    }
}
