package com.daw.gestion_alumno.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nota;

    private String asignatura;
    private double calificacion;

    // Relación muchos a uno: muchas notas pertenecen a un alumno
    @ManyToOne
    @JoinColumn(name = "id_alumno") // Clave foránea en la tabla notas
    private Alumno alumno;

    public Nota() {}

    public Nota(String asignatura, double calificacion, Alumno alumno) {
        this.asignatura = asignatura;
        this.calificacion = calificacion;
        this.alumno = alumno;
    }

    // Getters y setters
    public Long getId_nota() { return id_nota; }
    public String getAsignatura() { return asignatura; }
    public double getCalificacion() { return calificacion; }

    
    public Alumno getAlumno() { return alumno; }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}

