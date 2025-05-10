import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

// Introduccion a la clase File
public class CreacionFile {
    public static void main(String[] args) {
        // Crear un Objeto FIle utilizando una cadena que representa la ruta
        File archivo1 = new File("Introduccion_File/src/archivo.txt");

        // Crear un objeto File utilizando otro objeto File como base y una cadena que representa el nombre del archivo o directorio
        File directorio = new File("Introduccion_File/src");
        File archivo2 = new File(directorio, "archivo2.txt");

        // Ejemplo con fichero
        File fichero = new File("ejemplo.txt");
        if (fichero.exists()){
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());

        // Ejemplo con carpeta
        File carpeta = new File("Introduccion_File/src");
        if (carpeta.exists()){
            System.out.println("La carpeta existe");
        } else {
            System.out.println("La carpeta no existe");
        }
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());

        // CREAR Y BORRAR FICHEROS Y CARPETAS
        try {
            if (archivo1.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (directorio.mkdir()){
            System.out.println("Directorio creado");
        } else {
            System.out.println("No se pudo crear el directorio");
        }

        File borrarArchivo = new File("ArchivoParaEliminar.txt");
        if (borrarArchivo.delete()){
            System.out.println("Archivo eliminado");
        } else {
            System.out.println("No se pudo eliminar el archivo");
        }

        File directorio2 = new File(".");
        String[] archivos = directorio2.list();
        if (archivos != null){
            for (String a : archivos){
                System.out.println(a);
            }
        } else {
            System.out.println("No hay archivos en la carpeta");
        }
    }
}
