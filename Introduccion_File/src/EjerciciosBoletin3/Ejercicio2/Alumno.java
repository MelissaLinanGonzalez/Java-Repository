package EjerciciosBoletin3.Ejercicio2;

/*
 * Notas de alumnos
 * El archivo 'alumnos_notas.txt' contiene una lista de 10 alumnos y las notas que han obtenido en cada asignatura. El número de asignaturas de cada alumno es variable. Implementa un programa que muestre por pantalla la nota media de cada alumno junto a su nombr ey apellido, ordenado por nota media de mayor a menor*/

import java.awt.*;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Double> notas;

    public Alumno(String nombre, String apellido, List<Double> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getNotaMedia() {
        if (notas.isEmpty()) return 0.0;
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
