package Ejercicio2;

public class Main02 {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico("Frigorífico", "LG", 0.8);

        System.out.println(e1);
        e1.setPotencia(0.99);
        e1.setMarca("Samsung");
        System.out.println(e1);

        Lavadora laval1 = new Lavadora("LG", 0.95, 500, false);
        System.out.println(laval1);


        // Prueba clase lavadora
        int horas = 10;
        double preciokWh =  0.2;
        double consumo = e1.getConsumo(horas);
        double coste = e1.getCosteCOnsumo(horas, preciokWh);
        System.out.println("Ha consumido: " + consumo + " kW en " + horas + " horas");

        laval1.setAguaCaliente(true);
        System.out.println("Consumo de la lavadora en 10 horas: " + laval1.getConsumo(10));
        System.out.println("Coste del consumo en 10 horas: " + laval1.getCosteCOnsumo(10,1));

    }
}
