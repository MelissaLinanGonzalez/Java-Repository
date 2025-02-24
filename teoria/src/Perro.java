public class Perro extends Animal {
    public Perro(int edad, String nombre){
        super(edad, nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: Guau");
    }
}
