package EjerciciosBoletin3;

/*Maximo y minimo
* Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo.txt*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        String rutaArchivo = "Introduccion_File/src/Documentos/numeros.txt";

        ArrayList<Integer> maxMin = encontrarMaxMin(rutaArchivo);

        System.out.println("Máximo: " + maxMin.get(0));
        System.out.println("Mínimo: " + maxMin.get(1));
    }

    public static ArrayList<Integer> encontrarMaxMin(String archivo){
        Path path = Paths.get(archivo);
        ArrayList<Integer> retorno = new ArrayList<>();

        try {
            int maximo = Integer.MIN_VALUE; // Le da el minimo valor posible de enteros para que así el resto de números van siendo mayores a ese, por si fuese una lista de valores negativos, el 0 sería el numero mayor
            int minimo = Integer.MAX_VALUE;
            List<String> lineas = Files.readAllLines(path);
            for (String linea : lineas){
                String[] numeros = linea.split(" ");
                for (String numero : numeros){
                    int num = Integer.parseInt(numero);
                    if (num > maximo){
                        maximo = num;
                    }

                    if (num < minimo){
                        minimo = num;
                    }
                }
            }

            retorno.add(maximo);
            retorno.add(minimo);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }
}
