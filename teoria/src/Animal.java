public abstract  class Animal {
    private int edad;
    private String nombre;

    /**
     * Constructor parametrizado de clase abstracta Animal
     * @param edad
     * @param nombre
     */

    public Animal(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * metodo concreto que simula al animal durmiendo
     */
    public void dormir(){
        System.out.println(nombre + " está durmiendo.");
    }

    /**
     * metodo abstracto que es implementado por las subclases
     */
    public abstract void hacerSonido();


}
