package Dispositivos_Electronicos;

public class MainDispositivo {
    public static void main(String[] args) {
        DispositivoConBateria d1 = new DispositivoConBateria("Samsung Galaxy S24 Ultra", 10);
        System.out.println("");
        System.out.println("Batería inicial: " + d1.getBateria());
        d1.usarDispositivo();
        System.out.println("Batería del dispositivo " + d1.getNombre() + ": " +d1.getBateria() + "%");
        d1.setConsumoPorUso(30);//Actualizamos el consumo de bateria
        d1.usarDispositivo();
        System.out.println("Batería del dispositivo " + d1.getNombre() + ": " +d1.getBateria() + "%");

        System.out.println("");
        d1.setConsumoPorUso(30);//Actualizamos el consumo de bateria
        d1.usarDispositivo();
        System.out.println("Batería del dispositivo " + d1.getNombre() + ": " +d1.getBateria() + "%");

        System.out.println("");
        d1.setConsumoPorUso(30);//Actualizamos el consumo de bateria
        d1.usarDispositivo();
        System.out.println("Batería del dispositivo " + d1.getNombre() + ": " +d1.getBateria() + "%");

        System.out.println("");
        d1.setConsumoPorUso(30);//Aqui sabemos que no queda bateria
        d1.usarDispositivo();
        System.out.println("Batería del dispositivo " + d1.getNombre() + ": " +d1.getBateria() + "%");

        System.out.println("");
        System.out.println("Procedemos a la recarga del dispositivo: " + d1.getNombre());
        d1.recargarBateria();

        System.out.println("");
        Portatil p1 = new Portatil("Mac", 10);
        System.out.println("Consumo por uso: " + p1.getConsumoPorUso());
        p1.usarDispositivo();
        System.out.println("Batería portatil: " + p1.getBateria());
        System.out.println("");
        p1.activarAhorroEnergia();
        p1.setConsumoPorUso(20);
        System.out.println("Consumo por uso: " + p1.getConsumoPorUso());
        p1.usarDispositivo();
        System.out.println(p1.getBateria());
        System.out.println("");

        p1.setConsumoPorUso(50);
        System.out.println(p1.getConsumoPorUso());
        p1.usarDispositivo();
        System.out.println(p1.getBateria());

        System.out.println("");
        System.out.println("Recarga de portatil");
        p1.recargarBateria();

        System.out.println("");
        System.out.println("Consumo antes de activar el modo ultra ahorro de energia: " + d1.getConsumoPorUso());
        System.out.println(d1.getConsumoPorUso());
        System.out.println("Modo ultra ahorro de dispositivo con bateria");
        System.out.println("Bateria actual " + d1.getBateria());
        d1.modoUltraAhorro();
        System.out.println("Consumo actual: " + d1.getConsumoPorUso());
        d1.usarDispositivo();
        System.out.println("Dispositivo " + d1.getNombre() + " usado con modo ultra ahorro. " +
                "Consumo: " + d1.getConsumoPorUso() +
                ". Batería restante: " + d1.getBateria() + "%");
    }
}
