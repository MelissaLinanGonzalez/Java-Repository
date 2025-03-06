package Examen;

public class FraccionSimplificada extends Fraccion{
    public FraccionSimplificada(int num, int den) {
        super(num, den);
    }

    public FraccionSimplificada() {
    }

    public FraccionSimplificada(int num) {
        super(num);
    }

    public FraccionSimplificada simplificar(){
        int numNuevo = this.getNum()/mcd();
        int denNuevo = this.getDen()/mcd();
        return new FraccionSimplificada(numNuevo, denNuevo);
    }

    private int mcd(){
        int u = Math.abs(this.getNum());
        int v = Math.abs(this.getDen());
        while (v != 0){
            int r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    @Override
    public String toString() {
        return this.getNum() + "/" + this.getDen();
    }

}
