package CRUD;

/*
* Aqui se implementan los metodos como añadir, eliminar, buscar, listar y guardar.*/

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorContacto {
    private List<Contacto> contactos;
    private ObjectMapper mapeador = new ObjectMapper();
    private String archivo = "Introduccion_File/src/CRUD/Contactos.json";

    public GestorContacto(){
        contactos = new ArrayList<>();
        cargarContactos();
    }

    public void cargarContactos(){
        File archivojson = new File(archivo);
        try {
            if (archivojson.exists()){
                contactos = mapeador.readValue(archivojson, new TypeReference<List<Contacto>>(){});
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean eliminarContacto(String nombre){
        return contactos.removeIf(contacto -> contacto.getNombre().equals(nombre));
    }

    public Contacto buscarContacto(String nombre){
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                return contacto;
            }
        } return null;
    }

    public void agrgarContacto(Contacto contacto){
        contactos.add(contacto);
        guardarContactos();
        System.out.println("Contacto agregado con éxito");
    }

    public List<Contacto> listarContactos(){
        return contactos;
    }

    public void guardarContactos(){
        try {
            mapeador.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), contactos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
