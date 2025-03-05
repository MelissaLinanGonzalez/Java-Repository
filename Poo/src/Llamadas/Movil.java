package Llamadas;

import java.text.DecimalFormat;

/**
 * Implementa la clase Movil como subclase de Terminal. Cada movil lleva asociada una tarifa que puede ser
 * "rata", "mono" o "bisonte". El coste por minuto es de 6, 12 y 30 centimos respectivamente. Se tarofican
 * los segundos exactos. Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada.
 */

public class Movil extends Terminal{
    private String tarifa;
    private double coste;


    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal terminal, int tiempo){
        this.conversacion += tiempo;
        terminal.conversacion += tiempo;

        double tarifaPorSegundo = 0;
        if (this.tarifa == "rata"){
            tarifaPorSegundo = 0.06 /60;
        } else if (this.tarifa == "mono"){
            tarifaPorSegundo = 0.12 /60;
        } else if (this.tarifa == "bisonte"){
            tarifaPorSegundo = 0.3 /60;
        }
        this.coste += tarifaPorSegundo * tiempo;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Nª" + getNumero() + " - " + conversacion + "s de conversación - tarificados " + df.format(coste) + " euros";
    }

}
