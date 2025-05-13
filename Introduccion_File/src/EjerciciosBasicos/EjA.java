package EjerciciosBasicos;

// Implementa un programa que cree, dentro de 'Documentos', dos nuevas carperas: 'Mis Cosas' y 'Alfabeto'. Mueve las carpetas 'Fotografías' y 'Libros' dentro de 'Mis Cosas'. Luego crea dentro de 'Alfabeto' una carpeta por cada letra del alfabeto (en mayúsculas): 'A', 'B', 'C'... Te serán de ayuda los códigos numéricos ASCII

import java.io.File;

public class EjA {
    public static void crearCarpeta(){
        File carpetaDocumentos = new File("Introduccion_File/src/DocumentosEjBasicoA");
        File carpetaMisCosas = new File(carpetaDocumentos, "Mis cosas");
        File carpetaAlfabeto = new File(carpetaDocumentos, "Alfabeto");
        File carpetaOrigenIL = new File("Introduccion_File/src/Documentos");

        if (carpetaDocumentos.exists()){
            if (carpetaMisCosas.mkdir()){
                System.out.println("Carpeta 'Mis Cosas' creada correctamente");
            }
            if (carpetaAlfabeto.mkdir()){
                System.out.println("Carpeta 'Alfabeto' creada correctamente");
            }
        } else {
            System.out.println("Carpeta 'DocumentosEjBasicoA' no existe");
        }

        // Se mueven las carpetas de directorio
        moverCarpeta(carpetaOrigenIL, carpetaMisCosas, "Imagenes");
        moverCarpeta(carpetaOrigenIL, carpetaMisCosas, "Libros");

        // Dentro de la carpeta 'Alfabeto' se crean tantas carpetas como letras hay en el diccionario
        for (char c = 'A'; c <= 'Z'; c++) {
            File carpetaACrear = new File(carpetaAlfabeto, String.valueOf(c));
            if (carpetaACrear.mkdir()){
                System.out.println("Carpeta " + c + " creada");
            }
        }

    }

    public static void moverCarpeta(File carpetaOrigen, File carpetaDestino, String carpetaAMover){
        File origen = new File(carpetaOrigen, carpetaAMover);
        File destino = new File(carpetaDestino, carpetaAMover);

        if (origen.exists()){
            boolean movida = origen.renameTo(destino);
            if (movida){
                System.out.println("Carpeta movida");
            } else {
                System.out.println("Error al mover la carpeta");
            }
        } else {
            System.out.println("Carpeta de origen inexistente");
        }
    }

    public static void main(String[] args) {
        crearCarpeta();
    }
}
