package com.daw.condicionalesbuclesyfragmentos.controladora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpleadoControlador {

    @GetMapping("/empleados")
    public String mostrarEmpleados(Model model) {
        List<empleado> lista = new ArrayList<>();
        lista.add(new empleado("Ana Gómez", "Dirección", 45000));
        lista.add(new empleado("Carlos López", "IT", 32000));
        lista.add(new empleado("María Rodríguez", "Marketing", 28000));
        lista.add(new empleado("Javier Pérez", "Dirección", 48000));

        model.addAttribute("empleados", lista);
        return "empleados";
    }
}