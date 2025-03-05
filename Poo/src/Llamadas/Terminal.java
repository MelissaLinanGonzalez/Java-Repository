package Llamadas;

/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los terminales se pueden llamar
 * unos a otros, y el tiempo de conversación corre para ambos. El programa principal deberá crear
 * varios terminales, realizar llamadas entre ellos y mostrar el ltiempo de conversación de cada uno.
 */


public class Terminal {
    private String numero;
    private static int tiempo = 0;
    protected int conversacion;

    public Terminal(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void llama(Terminal terminal, int tiempo){
        this.conversacion += tiempo;
        terminal.conversacion += tiempo;
    }

    @Override
    public String toString() {
        return "Nª" + numero + " - " + conversacion + "s de conversación";
    }

}
