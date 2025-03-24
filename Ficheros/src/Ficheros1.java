import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros1 {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("src/archivo1.txt");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
