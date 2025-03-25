package exepciones;

public class Aritmetica {
    public static int division (int numerador, int denominador) throws Exception{
        // Con throws Exception estamos obligando al metodo y a las clases que lo usen a implementar el try catch
        if (denominador == 0){
            throw new Exception("División entre Cero"); //En tiempo de ejecución se reporta esta excepcion
        }
        return numerador/denominador;
    }
}
