package Gestion_Notas_Alumnos;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private double[][] calificaciones;

    // Constructor
    public Estudiante(String nombre, int numMaterias, int numEvaluaciones) {
        this.nombre = nombre;
        this.calificaciones = new double[numMaterias][numEvaluaciones];
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setCalificaciones(double[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    // Metodo para calcular el promedio por materia
    public double[] calcularPromedioMaterias() {
        double[] promedios = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones[i].length;
        }
        return promedios;
    }

    // Metodo para calcular el promedio general
    public double calcularPromedioGeneral() {
        double[] promediosMaterias = calcularPromedioMaterias();
        double suma = 0;
        for (double promedio : promediosMaterias) {
            suma += promedio;
        }
        return suma / promediosMaterias.length;
    }

    // Metodo para mostrar las calificaciones del estudiante
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
