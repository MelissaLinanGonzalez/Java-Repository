package maquina_Snacks_Archivos.servicio;

import maquina_Snacks_Archivos.dominio.Snack;
import java.util.List;

public interface IServioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();

}
