package EjercicioJSON.Ej2;

/*
* Crear Clase Usuario y una Clase Main para trabajar con objetos en formato JSON. Al final deberás poder guardar una LISTA de usuarios
* en un archivo.json y volver a leerla para reconstruir los objetos en memoria.
*
* Parte 2. Añade un campo int edad a la clase Usuario y por tanto, modifica el JSON.
* Modifica la lista para que se lea desde teclado antes de guardarla.
* Crea un metodo que recorra la lista y muestre los usuarios mayores de 30 años.*/

public class Usuario {
    private String nombre;
    private String email;

    public Usuario() {
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
