package com.daw.condicionalesbuclesyfragmentos.controladora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class pedidocontrolador {

    @GetMapping("/pedidos")
    public String mostrarPedidos(Model model) {
        List<pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(new pedido("Pedido #001 - Auriculares Inalámbricos", "pendiente"));
        listaPedidos.add(new pedido("Pedido #002 - Monitor 27 pulgadas", "enviado"));
        listaPedidos.add(new pedido("Pedido #003 - Teclado Mecánico", "entregado"));
        listaPedidos.add(new pedido("Pedido #004 - Alfombrilla Gaming", "pendiente"));

        model.addAttribute("pedidos", listaPedidos);
        return "pedidos";
    }
}