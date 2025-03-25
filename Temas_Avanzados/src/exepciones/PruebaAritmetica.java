package exepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            double resultado = Aritmetica.division(10, 2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e){
            System.out.println("Ocurrio un error: " + e);
        }
        finally {
            // este bloque siempre se ejecuta, independientemente si hay excepción o no
            System.out.println("Se revisó la división");
        }
    }
}
