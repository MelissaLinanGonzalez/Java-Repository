import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura_Lectura {
    public static void main(String[] args) {
        String texto = "Este es un ejemplo de uso de FileWriter en Java";
        String fichero = "fichero.txt";

        try {
            // Se crea un objeto FileWriter
            FileWriter fileWriter = new FileWriter(fichero);

            // Se escribe una String en el fichero
            fileWriter.write(texto);

            // Se cierra el FileWriter
            fileWriter.close();

            System.out.println("Se ha escrito en el fichero correctametne");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            // Se crea el objeto FileReader
            FileReader fileReader = new FileReader(fichero);

            // Se lee y muestra el contenido del archivo
            int caracter;
            System.out.println("Contenido del archivo: " + fichero + ": ");
            while ((caracter = fileReader.read()) != -1){
                System.out.println((char) caracter);
            }

            // Se cierra el FileReader
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
