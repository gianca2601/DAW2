package com.daw.gestion_alumno.modelos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    

}
