package SistemaGestionEstudiantes;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ismael", 34, "QFw57844");
        Estudiante e2 = new Estudiante("Melissa", 24, "MLz56544");

        e1.mostrarInformacion();
        e2.mostrarInformacion();
        Estudiante.registarEstudiante(e1);
        Estudiante.buscarEstudiante("MLz56544");
        Estudiante.buscarEstudiante("QFw57844");
    }
}
