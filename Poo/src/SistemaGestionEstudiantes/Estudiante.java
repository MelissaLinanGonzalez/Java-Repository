package SistemaGestionEstudiantes;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public Estudiante(String nombre, int edad, String matricula){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public static void registarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
        System.out.println("Se ha añadido " + estudiante.nombre + " a la lista");
    }

    public void mostrarInformacion(){
        System.out.println("Nombre alumno: " + this.nombre + ". Edad: " + this.edad + ". Matrícula: " + this.matricula);
    }

    public static void buscarEstudiante(String matricula){
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.matricula.equals(matricula)) {
                System.out.println("El estudiante con matricula: " + matricula + " se encuentra en la lista");
            } else {
                System.out.println("No se ha encontrado al estudiante con matricula: " + matricula);
            }
        }
    }

}