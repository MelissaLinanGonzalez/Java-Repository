package CuentasCorrientes;

/*
* Implementar la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 dígitos.
* Para simplificar, el número de cuenta se genera aleatoriamente cuando se crea una cuenta nueva. La cuenta
* se puede crear con un saldo inicial; en caso de no especificar un saldo, se pondrá a cero inicialmente.
* En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta
* y otra. Se permite el saldo negativo.*/

import java.text.DecimalFormat;
import java.util.Random;

public class CuentaCorriente {
    private int numAleatorio;
    private double saldo;

    public CuentaCorriente(){
        this.saldo = 0;
        Random random = new Random();
        numAleatorio = random.nextInt(900000000) + 100000000;
    }

    public CuentaCorriente(double saldo){
        this.saldo = saldo;
        Random random = new Random();
        numAleatorio = random.nextInt(900000000) + 100000000;
    }

    public void ingreso(double cantidad){
        this.saldo += cantidad;
    }

    public void transferencia(CuentaCorriente cuentaDestino, double cantidad){
        cuentaDestino.saldo += cantidad;
        this.saldo -= cantidad;
    }

    public void cargo(double cantidad){
        this.saldo -= cantidad;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Número de cta: " + numAleatorio + " Saldo: " + df.format(saldo);
    }
}
