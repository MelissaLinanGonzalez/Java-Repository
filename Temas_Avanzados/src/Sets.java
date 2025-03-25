import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Rodrigo");
        conjunto.add("Amparo");
        conjunto.add("Fermin");
        conjunto.add("Rodrigo");

        System.out.println("Elementos del set");
        conjunto.forEach(System.out::println);

        // Eliminar elementos
        conjunto.remove("Amparo");
        System.out.println("Nuevos elementos del set");
        conjunto.forEach(System.out::println);
    }
}
