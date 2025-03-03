package Dispositivos_Electronicos;

public class DispositivoConBateria extends Dispositivo{
    private int bateria;
    /**Heredamos el constructor de la clase Dispositivo añadiendole el atributo extra bateria*/
    public DispositivoConBateria(String nombre, int consumoPorUso) {
        super(nombre, consumoPorUso);
        this.bateria = 100;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    /**Se sobreescribe el metodo usarDispositivo, se implementa la reduccion de bateria*/
    @Override
    public void usarDispositivo(){
        if (bateria > 0){
            bateria -= this.getConsumoPorUso();
            System.out.println("El dispositivo " + this.getNombre() + " ha sido utilizado. Batería restante: " + bateria + "%");
        } else {
            System.out.println("El dispositivo se ha quedado sin batería");
        }
    }
    /**Se reestablece la bateria del dispositivo*/
    public void recargarBateria(){
        bateria = 100;
        System.out.println("¡Batería recargada. Nivel de batería: " + bateria + "!");
    }

    public void modoUltraAhorro(){
        setConsumoPorUso( getConsumoPorUso() / 2);
        System.out.println("Modo ultra ahorro activado");
    }

    //Pruebas para comprobar que la clase DispositivoConBateria funciona correctamente.
    /*public static void main(String[] args) {
        DispositivoConBateria d1 = new DispositivoConBateria("Movil", 10);

        d1.usarDispositivo();
        System.out.println(d1.bateria);
        d1.setConsumoPorUso(30);
        d1.usarDispositivo();
        System.out.println(d1.bateria);
        d1.setConsumoPorUso(60);
        d1.usarDispositivo();
        System.out.println(d1.bateria);
        d1.setConsumoPorUso(2);
        d1.usarDispositivo();
        System.out.println(d1.bateria);
        d1.recargarBateria();
        System.out.println(d1.bateria);
    }*/
}
