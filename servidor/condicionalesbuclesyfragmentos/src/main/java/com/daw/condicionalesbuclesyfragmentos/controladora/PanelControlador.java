package com.daw.condicionalesbuclesyfragmentos.controladora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PanelControlador {

    @GetMapping("/panel")
    public String mostrarPanel(
            @RequestParam(name = "perfil", defaultValue = "false") boolean mostrarPerfil,
            @RequestParam(name = "pedidos", defaultValue = "false") boolean mostrarPedidos,
            @RequestParam(name = "mensajes", defaultValue = "false") boolean mostrarMensajes,
            Model model) {

        model.addAttribute("mostrarPerfil", mostrarPerfil);
        model.addAttribute("mostrarPedidos", mostrarPedidos);
        model.addAttribute("mostrarMensajes", mostrarMensajes);

        return "panel";
    }
}