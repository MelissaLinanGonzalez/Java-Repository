public class pruebaCaballo {
    public static void main(String[] args) {
        //Tengo que instanciar la clase
        Caballo a = new Caballo("Pepe", "negro", 6, 2);
        Caballo b = new Caballo("Maria", "blanco", 5, 2);

        System.out.println("Hola, me llamo " + a.getNombre());
        a.cabalga();
        a.relincha();

        b.getNombre();
    }
}
