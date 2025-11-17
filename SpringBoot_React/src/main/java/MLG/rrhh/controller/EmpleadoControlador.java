package MLG.rrhh.controller;

import MLG.rrhh.model.Empleado;
import MLG.rrhh.service.EmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8081/rrhh-app/
@RequestMapping("rrhh-app")
@CrossOrigin(value = "http://localhost:3000") //Ya que vamos a hacer peticiones desde el frontend y react se va a levantar en el puerto 3000
public class EmpleadoControlador {
    // Se envía la información a consola
    private static final Logger logger= LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;

    //http://localhost:8081/rrhh-app/empleados
    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados(){
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return empleados;
    }
}
