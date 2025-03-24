/*Cómo convertir System.out en un objeto PrintWriter utilizando el constructor del PrintWriter*/

import java.io.PrintWriter;

public class Reto {
    public static void main(String[] args) {
        // System.out es un objeto PrintStream, que a su vez es de tipo OutputStream. PrintWriter tiene un constructor que toma por parámetro un objeto OutputStrem como argumento. Por tanto, si queremos convertir System.out en un objeto PrintWriter utilizaremos dicho constructor.

        PrintWriter pepe = new PrintWriter(System.out, true);
        pepe.println("He instanciado pepe para emplearlo como printeo en consola");
    }
}
