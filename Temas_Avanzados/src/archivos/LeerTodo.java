package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// Se lee el archivo de una vez
public class LeerTodo {
    public static void main(String[] args) {
        String nombreArchivo = "miArchivo.txt";
        try {
            // Leemos todas las lineas del archivo de una vez
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            /*for (String linea : lineas){
                System.out.println(linea);
            }*/
            // Ciclo forEach de lambda
            lineas.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
