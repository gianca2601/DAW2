package com.daw.gestion_alumno.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_alumno;

    private String nombre;
    private String apellidos;

    // Relación uno a muchos: un alumno tiene muchas notas
    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Nota> notas;

    // Constructor vacío obligatorio
    public Alumno() {}

    // Constructor con parámetros
    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Getters y setters
    public Long getId_alumno() { return id_alumno; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public List<Nota> getNotas() { return notas; }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
