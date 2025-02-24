public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro(3, "Pepito");
        Animal perro2 = new Perro(2, "Manolito");

        perro.hacerSonido(); //Pepito tendrá que hacer sonido
        perro.dormir();      //Pepito está durmiendo

        perro2.hacerSonido();
        perro2.dormir();

        System.out.println("La edad de " + perro.getNombre() + " es " + perro.getEdad());
    }
}