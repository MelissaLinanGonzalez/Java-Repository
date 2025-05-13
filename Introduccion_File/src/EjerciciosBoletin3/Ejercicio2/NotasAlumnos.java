package EjerciciosBoletin3.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotasAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader("Introduccion_File/src/Documentos/alumnos_notas.txt"));
            String linea;

            while ((linea = lector.readLine()) != null){
                String[] partes = linea.split(" ");

                String nombre = partes[0];
                String apellido = partes[1];

                List<Double> notas = new ArrayList<>();
                for (int i = 2; i < partes.length; i++){
                    notas.add(Double.parseDouble(partes[i]));
                }

                alumnos.add(new Alumno(nombre, apellido, notas));
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Ordenar de mayor a menor por nota media
        alumnos.sort((a1, a2) -> Double.compare(a2.getNotaMedia(), a1.getNotaMedia()));

        // Mostrar los resultados
        for (Alumno a : alumnos){
            System.out.printf("%s %s - Nota media: %.2f%n", a.getNombre(), a.getApellido(), a.getNotaMedia());
        }

    }
}
