package Ejercicio6_Tiempo;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void suma(Tiempo tiempo2){
        int horasTotal = 0;
        int minutosTotal = 0;
        int segundosTotal = 0;

        segundosTotal = this.segundos + tiempo2.segundos;
        if (segundosTotal >= 60){
            minutosTotal += segundosTotal / 60;
            segundosTotal = segundosTotal % 60;
        }

        minutosTotal += this.minutos + tiempo2.minutos;
        if (minutosTotal > 60){
            horasTotal += minutosTotal /60;
            minutosTotal = minutosTotal % 60;
        }

        horasTotal += this.horas + tiempo2.horas;

        setHoras(horasTotal);
        setMinutos(minutosTotal);
        setSegundos(segundosTotal);

    }

    public void resta(Tiempo tiempo){
        int segundosT = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int segundosOtro = tiempo.horas * 3600 + tiempo.minutos * 60 + tiempo.segundos;

        int resultado = 0;
        if (segundosOtro > segundosT){
            System.out.println("No se puede restar ya que el tiempo introducido es mayor al tiempo que se quiere restar");
        } else {
            resultado = segundosT - segundosOtro;
        }

        int horaNueva = resultado / 3600;
        int minutoNuevo = (resultado % 3600) / 60;
        int segundoNuevo = resultado % 60;

        setHoras(horaNueva);
        setMinutos(minutoNuevo);
        setSegundos(segundoNuevo);
    }

    @Override
    public String toString() {
        return  "horas=" + horas +
                ", minutos=" + minutos +
                ", segundos=" + segundos;
    }

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(2, 40, 30);
        System.out.println(t1);
        System.out.println(t2);
        t1.suma(t2);
        System.out.println(t1);

        System.out.println("Resta de horas: ");
        Tiempo t3 = new Tiempo(4,50,10);
        System.out.println(t3);
        System.out.println(t2);
        t3.resta(t2);
        System.out.println(t3);
    }
}
