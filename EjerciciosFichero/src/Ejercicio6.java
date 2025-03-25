import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        try{
            // Lectura del archivo original
            BufferedReader lector = new BufferedReader(new FileReader("EjerciciosFichero/src/datos5.txt"));

            // Preparamos escritura en el archivo destino
            BufferedWriter escritor = new BufferedWriter(new FileWriter("EjerciciosFichero/src/copia.txt"));
            String linea;
            while ((linea = lector.readLine()) != null){
                escritor.write(linea);
                // Salto de linea
                escritor.newLine();
            }
            lector.close();
            escritor.close();
            System.out.println("Archivo copiado correctamente");

        } catch (IOException e){
            System.out.println("Error al cargar el archivo" + e.getMessage());
        }
    }
}
