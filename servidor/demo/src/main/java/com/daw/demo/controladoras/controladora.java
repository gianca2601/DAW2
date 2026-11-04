package com.daw.demo.controladoras;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping ("/coches")

public class controladora {

    @GetMapping("/angela")
    public String angela(@RequestParam String nombre ,Model modelo) {
        modelo.addAttribute("nombre", nombre);


        return "coches";
    }
    

}
