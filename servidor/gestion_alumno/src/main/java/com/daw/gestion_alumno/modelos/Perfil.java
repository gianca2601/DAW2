package com.daw.gestion_alumno.modelos;
import jakarta.persistence.*;


@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_perfil;

    private String direccion;
    private String telefono;
    private String foto_url;

    // Relación uno a uno: el perfil pertenece a un alumno
    @OneToOne
    @JoinColumn(name = "id_alumno", unique = true)
    private Alumno alumno;

    public Perfil() {}

    public Perfil(String direccion, String telefono, String foto_url) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.foto_url = foto_url;
    }

    // Getters y setters
    public Long getId_perfil() { return id_perfil; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getFoto_url() { return foto_url; }
    public Alumno getAlumno() { return alumno; }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
   

}
