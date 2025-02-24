public class cubo {
    // Atributos

    int capacidad; // volumen máximo en litros
    int contenido; // contenido actual en litros

    // Métodos

    // Constructor
    cubo(int c) {
        this.capacidad = c;
    }

    int getCapacidad() {
        return capacidad;
    }

    void setCapacidad(int c){
        this.capacidad = c;
    }

    int getContenido() {
        return contenido;
    }

    void setContenido(int c){
        this.contenido = c;
    }

    void llena(){
        this.contenido = this.capacidad;
    }

    void vacio(){
        this.contenido = 0;
    }

    void pinta(){
        System.out.println("____________");
        System.out.println("____________");
    }

    void vuelcaEn(cubo destino){
        int libres = destino.getCapacidad() - destino.getContenido();
        if (libres > 0){
            destino.setContenido(destino.getContenido() + this.contenido);
        }
    }

    public static void main(String[] args) {
        cubo cubito = new cubo(2);
        cubo cubazo = new cubo(7);

        cubito.pinta();
        cubazo.pinta();

        cubito.llena();
    }
}