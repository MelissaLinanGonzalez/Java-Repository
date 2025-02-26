package Gestion_Notas_Alumnos;

public class Estudiante {
    private String nombreEstudiante;
    private double [][] calificaciones;

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = new double[][]{calificaciones};
    }

    public Estudiante(String nombreEstudiante, int materias, int evaluaciones) {
        this.nombreEstudiante = nombreEstudiante;
        this.calificaciones = new double[materias][evaluaciones];
    }

    public double[] calcularPromedioMaterias(){
        double [] promedios = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++){
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++){
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones[i].length;
        }
        return promedios;
    }

    public double calcularPromedioGeneral(){
        double sumaTotal = 0;
        int cantidadNotas = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                sumaTotal += calificaciones[i][j];
                cantidadNotas++;
            }
        }
        return sumaTotal/cantidadNotas;
    }

    public void mostrarCalificaciones(){
        System.out.println("Calificaciones del estudiante: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificaciones de la asignatura " + (i+1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("Evaluación " + (j+1) + ": " + calificaciones[i][j]);
            }
        }
    }
}
