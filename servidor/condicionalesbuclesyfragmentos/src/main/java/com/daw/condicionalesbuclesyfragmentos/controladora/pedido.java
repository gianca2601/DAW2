package com.daw.condicionalesbuclesyfragmentos.controladora;

public class pedido {
    private String nombre;
    private String estado;

    public pedido(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }
}