package com.daw.practicaclase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller 
public class controladora {

    @GetMapping("/producto")
    public String mostrarProducto(Model modelo) {
        modelo.addAttribute("nombre", "monitor");
        modelo.addAttribute("precio",189.95);
        modelo.addAttribute("stock",12);
        modelo.addAttribute("categoria","informatica");

        return "producto";
    }
    

}
