# ¿Qué significa **static** en Java?
_static_ se utiliza para definir miembros (**atributos o métodos**) que pertenecen a la **clase en sí misma**, y no a un objeto (instancia) de esa clase.

Cuando algo es **estático**:
 - No necesitas crear un objeto de la clase para usarlo
 - **Es compartido por todos los objetos de la clase**



```java
class Ejemplo {
    static int contador = 0;
    public Ejmplo() {
        contador ++;
    }
    static voir mostrarContador(){
        System.out.println("Contador: " + contador);
    }
    public static void main(String[] args) {
        Ejemplo ej1 = new Ejemplo();
        Ejemplo ej2 = new Ejemplo();
        
        Ejemplo.mostrarContador();
    }
}
```

En la clase Ejemplo anterior, contador es un atributo estático. Por tanto, todos los objetos de la clase **comparten la misma variable (contador)**

Otro ejemplo:
```java
class Ejemplo {
    static String nacionalidad = "Española";
    
    static voir mostrarNacionalidad(){
        System.out.println("Contador: " + contador);
    }
    public static void main(String[] args) {
        Ejemplo ej1 = new Ejemplo();
        Ejemplo ej2 = new Ejemplo();
        
        //Aqui la salida muestra el mismo valor
        System.out.println(ej1.nacionalidad);
        System.out.println(ej2.nacionalidad);
        
        //Ejemplo.mostrarNacionalidad();
        
        //Un cambio en un objeto, afecta al resto:
        ej1.nacionalidad = "Francesa";
        System.out.println(ej1.nacionalidad);
        //En el otro objeto tambien:
        System.out.println(ej2.nacionalidad);
    }
}
```

**Métodos estáticos**.
Son funciones que **no depende de una instancia de la clase**. Sólo pueden acceder a otros atributos que también sean _static_.

**¿Cuándo usar _static_?**
1. Para valores o métodos compartidos por todas las instancias de una clase.
    Ejemplos: un contador global, una constante o funciones de uso genérico.
2. Cuando no necesitas datos específicos de una instancia.
    Ejemplo: métodos matemáticos como Math.sqrt() o Math.pow()
3. Punto de entrada al programa. Por ejemplo, el public static void main(String[] args) es **static** por que no se requiere crear un objeto para ejecutar el programa.

**Conclusiones o reglas importantes de uso**

1. Los métodos o atributos estáticos no pueden acceder a miembros no estáticos.
2. Los métodos o atributos no estáticos pueden acceder a los estáticos.