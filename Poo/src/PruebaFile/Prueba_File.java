package PruebaFile;

import java.io.*;

public class Prueba_File {
    public static void main(String[] args) throws IOException {
        /*File archivo1 = new File("/home/melissa/Escritorio/archivo_prueba");

        if (archivo1.exists()){
            System.out.println("El archivo existe");
        }
        System.out.println("Nombre del fichero: " + archivo1.getName());
        System.out.println("Ruta absoluta: " + archivo1.getAbsolutePath());
        System.out.println("Tamaño del fichero: " + archivo1.length());


        File archivo = new File("nuevoArchivo.txt");
        try {
            if (archivo.createNewFile())
                System.out.println("Archivo creado");
            else
                System.out.println("El archivo ya existe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(archivo.getAbsolutePath());

         File f1 = new File("/home/ester/");
        if (f1.exists()) {
            System.out.println("Nombre: "+f1.getName()+"\nPath: "+f1.getAbsolutePath()+"\nLongitud:"+f1.length());
        }else{
            System.out.println("El fichero no existe.");
        }

        File f2=new File("nuevoArchivo.txt");
        try{
            if(f2.createNewFile()) System.out.println("Creando nuevo fichero...\nEl fichero se ha guardado."+"Nombre: "+f2.getName()+"\nPath: "+f2.getAbsolutePath()+"\nLongitud:"+f2.length());
            else System.out.println("Creando nuevo fichero...\nEl fichero no se ha guardado.");
        }catch(IOException e){
            e.printStackTrace();
        }*/

        File archivo = new File("/home/melissa/Escritorio/archivo_prueba");

        //FileReader fr = new FileReader(archivo);
        /*if (archivo.exists()) {
            System.out.println("Archivo existe");
            try (FileReader fr = new FileReader(archivo)) {
                int i;
                while ((i = fr.read()) != -1) {  // Lee hasta el final del archivo
                    System.out.print((char) i);  // Convierte el número ASCII en un carácter
                }
                System.out.println(); // Para un salto de línea al final
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo no existe");
        }*/



        /*try{
            FileReader fr = new FileReader(archivo);
            BufferedReader bfr = new BufferedReader(fr);
            String contenido = bfr.readLine();
            while (contenido != null){
                System.out.println(contenido);
                contenido = bfr.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        


    }


}
