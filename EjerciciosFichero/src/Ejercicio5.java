import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("EjerciciosFichero/src/datos5.txt");
            BufferedReader lector = new BufferedReader(fr);
            String linea;
            int totalPalabras = 0;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                String[] palabras = linea.split("\\s+");
                totalPalabras += palabras.length;
            }

            System.out.println("Total de palabras: " + totalPalabras);

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
