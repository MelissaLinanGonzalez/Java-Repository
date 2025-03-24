public interface Traductor {
    // Una interfaz no puede ser instanciada ya que contiene metodos abstractos
    // public y abstract
    void traducir(); //Las clases hijas deben implementar este metodo

    // Métodos con implementación por defecto
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a Ingles");
    }
}

class Frances implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a Frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Frances ...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();

    }
}