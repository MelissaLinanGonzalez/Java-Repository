import java.io.File;
import java.io.IOException;

// Renombrar un archivo
public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            //Creamos objetos File para ficheros antiguos y nuevos
            File archivoOriginal = new File("EjerciciosFichero/src/datos9.txt");
            File archivoNuevo = new File("EjerciciosFichero/src/info9.txt");
            if (archivoOriginal.renameTo(archivoNuevo)){
                System.out.println("Archivo renombrado exitosamente de : " + archivoOriginal.getName() + " a " + archivoNuevo.getName());
            } else {
                System.out.println("Archivo no renombrado");
            }

        } catch (Exception e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
