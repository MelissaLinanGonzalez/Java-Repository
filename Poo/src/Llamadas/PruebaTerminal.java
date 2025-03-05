package Llamadas;

public class PruebaTerminal {
    public static void main(String[] args) {
        Terminal t1 = new Terminal("641 258 484");
        Terminal t2 = new Terminal("687 451 021");
        Terminal t3 = new Terminal("687 459 302");
        Terminal t4 = new Terminal("689 111 021");

        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        System.out.println("");
        Movil m1 = new Movil("658 125 811", "rata");
        Movil m2 = new Movil("658 487 540", "mono");
        Movil m3 = new Movil("687 548 000", "bisonte");

        System.out.println("Llamadas con móviles");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3,200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
