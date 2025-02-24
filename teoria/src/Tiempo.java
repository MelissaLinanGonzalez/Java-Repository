// Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
// Tiempo t = new Tiempo(1,20,30)
// DOnde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el metodo toString para ver los intervalos de tiempo de la forma 10h 35m 5s.
// Si se suman por ejemplo 30m 40s y 35m 20s, el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar que la clase funciona correctamemte.

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        formatearTiempo();

    }
    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void formatearTiempo(){
        int horaNueva;
        if (segundos >= 60){
            minutos += segundos / 60;
            segundos = segundos % 60;
        }
        if(minutos >= 60){
            horas += minutos / 60;
            minutos = minutos % 60;
        }
        if(horas >= 24) {
            horaNueva = horas % 24;
            horas = horaNueva;
        }
    }
    public String toString(){ // Esto te mete el formato de horas h, minutos m, segundos s
        return horas + "h " + minutos + "m " + segundos + "s";
    }

    public Tiempo sumar(Tiempo a, Tiempo b){
        int sumaHoras = a.horas + b.horas;
        int sumaMinutos = a.minutos + b.minutos;
        int sumaSegundos = a.segundos + b.segundos;

        return new Tiempo(sumaHoras, sumaMinutos, sumaSegundos);
    }
    public Tiempo restar (Tiempo a, Tiempo b ){
        int restaHoras = a.horas - b.horas;
        int restaMinutos = a.minutos - b.minutos;
        int restaSegundos = a.segundos - b.segundos;

        return new Tiempo(restaHoras, restaMinutos, restaSegundos);
    }

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0, 30, 40);
        Tiempo t2 = new Tiempo(0, 35, 20);

        System.out.println(t1);
        System.out.println(t1.sumar(t1, t2)); //Accedemos al metodo sumar en el que le pasamos dos variables de tipo TIEMPO y se suman, no hace falta hacer nada más para mostrar la suma de los tiempo.

        //OTRA MANERA DE HACERLO SIN EL TOSTRING
        /*Tiempo t3 = t1.Sumar(t1,t2); creamos una variable nueva a la que le pasamos la suma de las dos variables tiempo*/
        /*System.out.println(t1.getHoras() + "h " + t1.getMinutos() + "m " + t1.getSegundos() + "s");
        System.out.println(t2.getHoras() + "h " + t2.getMinutos() + "m " + t2.getSegundos() + "s");*/
        /*System.out.println(t3.getHoras() + "h " + t3.getMinutos() + "m " + t3.getSegundos() + "s"); aqui accedemos a las horas minutos y segundos del tiempo creado a partir de la suma de los dos tiempos.*/
    }

}


