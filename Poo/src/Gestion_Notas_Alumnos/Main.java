package Gestion_Notas_Alumnos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorDeCalificaciones gestor = new GestorDeCalificaciones();

        boolean seguir = true;

        while (seguir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar promedios");
            System.out.println("3. Verificar promedios menores a 5");
            System.out.println("4. Buscar mejor estudiante");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    gestor.agregarEstudiante();
                    break;
                case 2:
                    gestor.mostrarPromedios();
                    break;
                case 3:
                    gestor.verificarPromedio();
                    break;
                case 4:
                    gestor.buscarMejorEstudiante();
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        System.out.println("Programa terminado.");
        sc.close();
    }
}

