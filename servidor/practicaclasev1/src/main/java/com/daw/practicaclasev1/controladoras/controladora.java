package com.daw.practicaclasev1.controladoras;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class controladora {

@GetMapping("/producto")
public String mostrarProducto(Model modelo) {
    producto p =new producto ("Monitor", 189.95, 12, "informatica");
   
        modelo.addAttribute("prod",p);
   
    return "producto";
}

}
