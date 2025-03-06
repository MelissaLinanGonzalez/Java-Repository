package Gestion_Notas_Alumnos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GestorDeCalificaciones {
    private ArrayList<Estudiante> estudiantes;

    public GestorDeCalificaciones() {
        estudiantes = new ArrayList<>();
    }

    // Metodo para agregar un estudiante
    public void agregarEstudiante() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el número de materias: ");
        int numMaterias = sc.nextInt();

        System.out.print("Ingrese el número de evaluaciones por materia: ");
        int numEvaluaciones = sc.nextInt();

        Estudiante estudiante = new Estudiante(nombre, numMaterias, numEvaluaciones);

        double[][] calificaciones = new double[numMaterias][numEvaluaciones];

        // Ingresar calificaciones
        for (int i = 0; i < numMaterias; i++) {
            System.out.println("Ingrese las calificaciones para la materia " + (i + 1) + ":");
            for (int j = 0; j < numEvaluaciones; j++) {
                System.out.print("Evaluación " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
            }
        }

        estudiante.setCalificaciones(calificaciones);
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado correctamente.");
    }

    // Metodo para mostrar los promedios por materia y general
    public void mostrarPromedios() {
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarCalificaciones();
            double[] promediosMaterias = estudiante.calcularPromedioMaterias();
            double promedioGeneral = estudiante.calcularPromedioGeneral();

            System.out.println("Promedio por materia de " + estudiante.getNombre() + ": " + Arrays.toString(promediosMaterias));
            System.out.println("Promedio general de " + estudiante.getNombre() + ": " + promedioGeneral);
            System.out.println();
        }
    }

    // Metodo para verificar si algún estudiante tiene un promedio menor que 5
    public void verificarPromedio() {
        for (Estudiante estudiante : estudiantes) {
            double promedioGeneral = estudiante.calcularPromedioGeneral();
            if (promedioGeneral < 5.0) {
                System.out.println("¡Alerta! El estudiante " + estudiante.getNombre() + " tiene un promedio general menor a 5.0.");
            }
        }
    }

    // Metodo para encontrar al mejor estudiante (con mayor promedio general)
    public void buscarMejorEstudiante() {
        Estudiante mejorEstudiante = null;
        double mejorPromedio = 0;

        for (Estudiante estudiante : estudiantes) {
            double promedioGeneral = estudiante.calcularPromedioGeneral();
            if (promedioGeneral > mejorPromedio) {
                mejorPromedio = promedioGeneral;
                mejorEstudiante = estudiante;
            }
        }

        if (mejorEstudiante != null) {
            System.out.println("El mejor estudiante es " + mejorEstudiante.getNombre() + " con un promedio general de " + mejorPromedio);
        }
    }
}
