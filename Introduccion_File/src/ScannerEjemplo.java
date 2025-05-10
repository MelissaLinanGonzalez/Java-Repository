import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        File archivo = new File("Introduccion_File/src/archivo.txt");
        try {
            Scanner entrada = new Scanner(archivo);

            while (entrada.hasNext()){
                String linea = entrada.nextLine();
                System.out.println(linea);
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
        }
    }
}
