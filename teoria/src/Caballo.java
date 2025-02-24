public class Caballo {
    private String nombre;
    private int edad;
    private int carrerasGanadas;
    private String color;

    Caballo(String n, String c, int e, int cg){
        this.nombre = n;
        this.edad = e;
        this.color = c;
        this.carrerasGanadas = cg;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void cabalga(){
        System.out.println("Tocoto tocoto tocoto");
    }

    public void relincha(){
        System.out.println("Yiiiiiiiiiiieeeehaa");
    }
}
