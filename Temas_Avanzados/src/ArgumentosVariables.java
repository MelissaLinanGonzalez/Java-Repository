public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1, 2, 3, 4, 5); // Argumentos variables (varargs)
        variosParametros("Amparo", 10, 20, 30, 40, 50, 60); //Primero van los parámetros que no son argumentos variables
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros) { //Los tres puntos significa que no se sabe cuántos paraámetros se van a introducir
        for (int i=0; i< numeros.length; i ++){
            System.out.print(numeros[i] + " ");
        }
    }
}
