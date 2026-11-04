package com.daw.variables_frag_bloques.controladora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class ejercicioFragmento {
@GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/productos")
    public String productos() {
        return "productos";
    }
}
