package com.daw.condicionalesbuclesyfragmentos.controladora;

public class empleado {
    private String nombre;
    private String departamento;
    private double salario;

    public empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
}