package Dispositivos_Electronicos;

public class Portatil extends DispositivoConBateria{
    private boolean ahorroEnergia;
    public Portatil(String nombre, int consumoPorUso) {
        super(nombre, consumoPorUso);
        this.ahorroEnergia = false;
    }

    public void activarAhorroEnergia(){
        this.ahorroEnergia = true;
        System.out.println("Modo ahorro de energía activado");
    }

    public void desactivarAhorroEnergia(){
        this.ahorroEnergia = false;
        System.out.println("Modo ahorro de energía desactivado");
    }

    @Override
    public void usarDispositivo(){
        if (ahorroEnergia == true){
            if (getBateria() > 0){
                int consumo = getConsumoPorUso() /2;
                setBateria(getBateria()- consumo);
                System.out.println("Batería del portatil " + getNombre() + ": " + getBateria() + "%");
            } else {
                System.out.println("Batería agotada");
            }
        } else {
            if (getBateria() > 0){
                setBateria(getBateria() - getConsumoPorUso());
                System.out.println("Batería del portatil " + getNombre() + ": " + getBateria() + "%");
            } else {
                System.out.println("Batería agotada");
            }
        }
    }
}
