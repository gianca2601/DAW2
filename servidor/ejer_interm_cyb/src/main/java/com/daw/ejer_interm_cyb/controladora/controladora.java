package com.daw.ejer_interm_cyb.controladora;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;






@Controller 
public class controladora {

    @GetMapping("/ejercicio1")
    public String ejercicio1 (Model modelo) {
       List<usuario> usuarios = new ArrayList<>();
        usuarios.add(new usuario("Ana López", "ADMIN", true));
        usuarios.add(new usuario("Carlos Gómez", "USER", false));
        usuarios.add(new usuario("María Rodríguez", "USER", true));
        usuarios.add(new usuario("Juan Pérez", "ADMIN", false));

        modelo.addAttribute("usuarios", usuarios);
       
       
        return "ejercicio1" ;
    }
    
@GetMapping("/ejercicio2")
public String ejercicio2(Model modelo) {
    Map<String, List<String>> categorias = new LinkedHashMap<>();
    
    categorias.put("Frutas", List.of("Manzana", "Naranja"));
    categorias.put("Electrónica", List.of("Portátil", "Móvil"));
    categorias.put("Ropa", List.of()); // Categoría vacía

    modelo.addAttribute("categorias", categorias);
    return "ejercicio2";
}


@GetMapping("/ejercicio3")
public String ejercicio3(Model modelo) {

List<Map<String, Object>> alumnos = List.of(
        Map.of("nombre", "Ana", "nota", 8.5),
        Map.of("nombre", "Luis", "nota", 4.2),
        Map.of("nombre", "Carlos", "nota", 5.0),
        Map.of("nombre", "Marta", "nota", 3.8)
    );

    modelo.addAttribute("alumnos", alumnos);
    return "ejercicio3";
}

}
