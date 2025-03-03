package Dispositivos_Electronicos;

public class Dispositivo {
    private String nombre;
    private int consumoPorUso;

    public Dispositivo(String nombre, int consumoPosUso){
        this.nombre = nombre;
        this.consumoPorUso = consumoPosUso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConsumoPorUso() {
        return consumoPorUso;
    }

    public void setConsumoPorUso(int consumoPorUso) {
        this.consumoPorUso = consumoPorUso;
    }

    public void usarDispositivo(){
        System.out.println("El dispositivo " + getNombre() + " ha sido usado.");
    }

    //Prueba para comprobar que la clase Dispositivo funciona correctamente
    /*public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo("Movil", 100);
        dispositivo1.usarDispositivo();
    }*/
}
