package com.daw.proyectoanotaciones.controladora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller  //indica que la clase es un controlador dentro del patron MVC
public class controladora {

    @GetMapping("/indice")
    public String indice(Model modelo) {
       
        return  "indice";
    }
    @GetMapping("/datos")
    public String recibirDatos(@RequestParam String param) {
        return "datos";
    }
    
}
