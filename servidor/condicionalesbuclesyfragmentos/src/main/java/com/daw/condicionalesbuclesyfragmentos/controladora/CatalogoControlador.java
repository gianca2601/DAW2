package com.daw.condicionalesbuclesyfragmentos.controladora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CatalogoControlador {

    @GetMapping("/catalogo")
    public String mostrarCatalogo(@RequestParam(name = "filtro", defaultValue = "todos") String filtro, Model model) {
        List<producto> lista = new ArrayList<>();
        lista.add(new producto("Lápiz de precisión", 2.50));      // En oferta (< 10)
        lista.add(new producto("Auriculares Estándar", 45.00));  // Normal
        lista.add(new producto("Portátil Gaming Pro", 1499.99)); // Caro (> 1000)
        lista.add(new producto("Alfombrilla Básica", 8.99));     // En oferta (< 10)

        model.addAttribute("productos", lista);
        model.addAttribute("filtro", filtro);

        return "catalogo";
    }
}