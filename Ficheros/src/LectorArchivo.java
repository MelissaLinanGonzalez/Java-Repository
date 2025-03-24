/*
* Programa que recibe el nombre de un archivo como argumento y muestra su contenido en la consola
* */

public class LectorArchivo {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println("Argumento recibido: " + args[0]);
        } else {
            System.out.println("No se han encontrado argumentos");
        }
    }
}
