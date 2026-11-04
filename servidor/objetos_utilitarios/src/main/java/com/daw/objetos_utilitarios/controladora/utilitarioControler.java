package com.daw.objetos_utilitarios.controladora;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller 
public class utilitarioControler {

	@GetMapping("/utilitarios")
	public String mostrar(Model modelo) {
        LocalDateTime fecha = LocalDateTime.of(2026,10,5,9,30);
        modelo.addAttribute("fecha",fecha);
		return "utilitarios";
	}
    @GetMapping("/numeros")
    public String numeros(Model modelo) {
        modelo.addAttribute("numero", 100.5);
        return "numeros";
    }
    @GetMapping("/listas")
    public String listas(Model modelo) {
        modelo.addAttribute("listanumeros", List.of(2,7,23,98,0));
        modelo.addAttribute("listanombres",List.of("pepe","ana","maria"));
        return "listas";
    }
    
    
}
