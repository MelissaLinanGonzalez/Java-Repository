package ElCorteIslandes;

/*
* La empresa El Corte Islandés quiere una aplicación para gestionar las tarjetas regalos. Como primer paso
* para implementar la aplicación, es necesario crear la clase principal. Implementa la clase TarjetaRegalo.
* Cuando se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos.
* Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostar un mensaje de error. Dos tarjetas
* regalos se pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
* número aleatorio de 5 cifas. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con
* 0€ de saldo.*/


import java.text.DecimalFormat;
import java.util.Random;

public class TarjetaRegalo {
    private double saldo;
    private int numAleatorio;

    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        Random random = new Random(); //Se genera el número aleatorio cada vez que se instancia un objeto
        this.numAleatorio = random.nextInt(9000) + 1000;
    }

    public void gasta(double gasto){
        if (gasto > this.saldo){ //Comprueba que el gasto no sea superior al saldo disponible
            System.out.println("No tiene suficiente salgo para gastar " + gasto);
        } else {
            this.saldo -= gasto;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Tarjeta nº " + numAleatorio + " - Saldo " + df.format(saldo) + "€";
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjetaRegalo){
        double saldoNuevo = this.saldo + tarjetaRegalo.saldo; //Se crea un nuevo saldo con la fusion de los saldos de ambas tarjetas
        setSaldo(0); //Se estable el saldo de ambas tarjetas participantes en 0
        tarjetaRegalo.setSaldo(0);
        return new TarjetaRegalo(saldoNuevo); //Se crea el nuevo objeto con el saldo obtenido de la suma
    }

}
