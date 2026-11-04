package com.daw.practica1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

    @GetMapping("/curso/java")
    public String cursoJava(Model model) {
        model.addAttribute("nombre", "Introducción a Java");
        model.addAttribute("aula", "Aula 201");
        model.addAttribute("plazasTotales", 25);
        model.addAttribute("plazasOcupadas", 18);
        model.addAttribute("plazasDisponibles", 25 - 18);

        return "curso";
    }

    @GetMapping("/curso/web")
    public String cursoWeb(Model model) {
        model.addAttribute("nombre", "Desarrollo web");
        model.addAttribute("aula", "Aula 202");
        model.addAttribute("plazasTotales", 20);
        model.addAttribute("plazasOcupadas", 20);
        model.addAttribute("plazasDisponibles", 20 - 20);

        return "curso";
    }
}