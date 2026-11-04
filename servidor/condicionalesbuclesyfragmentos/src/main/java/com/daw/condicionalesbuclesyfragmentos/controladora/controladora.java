package com.daw.condicionalesbuclesyfragmentos.controladora;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controladora {

    @GetMapping("/inicio")
    public String inicio(
            @RequestParam(defaultValue = "INVITADO") String rol,
            Model model) {

        Map<String, String> usuario = new HashMap<>();
        usuario.put("rol", rol);

        model.addAttribute("usuario", usuario);

        return "inicio";
    }
}