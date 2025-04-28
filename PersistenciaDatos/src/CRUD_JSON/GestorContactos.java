package CRUD_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorContactos {
    private List<Contacto> contactos;
    private final String archivo = "Agenga.json";
    private final ObjectMapper mapeador= new ObjectMapper();

    public GestorContactos(){
        contactos = new ArrayList<>();
        cargarContactos();
    }

    private void cargarContactos(){
        try{
            File file = new File(archivo);
            if (file.exists()){
                contactos = mapeador.readValue(file, new TypeReference<List<Contacto>>() {});
            }
        } catch (IOException e) {
            System.out.println("No se pudieron cargar los contactos");
        }
    }

    public void guardarContactos(){
        try {
            mapeador.writerWithDefaultPrettyPrinter().writeValue(new File(archivo), contactos);
        } catch (IOException e) {
            System.out.println("Error al guardar los contactos");
        }
    }

    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public boolean eliminarContacto(String nombre){
        return contactos.removeIf(contacto -> contacto.getNombre().equalsIgnoreCase(nombre));
    }

    public Contacto buscarContacto(String nombre){
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                return contacto;
            }
        } return null;
    }

    public List<Contacto> listarContactos(){
        return contactos;
    }

}
