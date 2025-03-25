import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("Apellido", "Flores");
        persona.put("Edad", "31");
        persona.put("Ciudad", "Córdoba");

        //No mantiene orden ni repite elementos duplicados
        System.out.println("Valores del diccionario:");
        persona.entrySet().forEach(System.out::println);
        System.out.println(" ");
        persona.put("Edad", "35"); // Se modifiva el valor de la clave ya existente
        System.out.println("Nuevos valores");
        persona.entrySet().forEach(System.out::println);

        //Eliminar elemento, desde la clave
        persona.remove("Apellido");
        System.out.println("");
        persona.entrySet().forEach(System.out::println);

        System.out.println(" ");
        //Iterar elementos por separado
        System.out.println("Iterando elementos (Clave, valor)");
        persona.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        });
    }
}
