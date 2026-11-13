package com.daw.gestion_alumno.controladoras;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daw.gestion_alumno.servicios.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.daw.gestion_alumno.modelos.Alumno;
import com.daw.gestion_alumno.modelos.Nota;
import com.daw.gestion_alumno.modelos.Perfil;
@Controller 
@RequestMapping ("/alumno")
public class AlumnoControladora {



        // que servicio vamos a usar 
        // es una inyeccion

    private final AlumnoService alumnoService;

    public  AlumnoControladora(AlumnoService alumnoService){
        this.alumnoService =  alumnoService;
    }
    //endpoints 
    // de prueba

    @GetMapping("/crea_alumno")
    public String prueba() {

        Alumno al1 = new Alumno("pepe", "pepez pepez");
        this.alumnoService.guardar(al1);
        return "probado";
    }
    @GetMapping("/crea_alumno_con_notas")
    public String prueba2() {

        Alumno al1 = new Alumno("Angel", "hoyos profundos");
        

        Nota  nota = new Nota("servidor", 1, al1);
        Nota  nota1 = new Nota("estupidez ", 10, al1);
        
        al1.setNotas(List.of(nota,nota1));
     
        
        this.alumnoService.guardar(al1);

        return "notasAngel";
    }
    @GetMapping
    public String listarAlumnos(Model modelo) {
        modelo.addAttribute("listaAlumnos",this.alumnoService.listarTodos());

        return "lista-alumnos";
    }
    @GetMapping("/{id}")
    public String verDetalles(@PathVariable Long id, Model modelo) {
        Optional<Alumno> alumno = this.alumnoService.buscarPorId(id);

        //comprobar si hay aluno con esa id
        if (alumno.isEmpty()){
          return "redirect:/alumno";  
        }
        

        modelo.addAttribute("alumno", alumno.get());
        return "detalle-alumno";
    }
    
    @GetMapping("/perdil/{id}")
    public String verPerfil(@PathVariable Long id, Model model) {
        Optional<Alumno> alumno = this.alumnoService.buscarPorId(id);
        //comprobar si hay alumno con esa id
        if(alumno.isEmpty() || alumno.get().getPerfil() == null){
        return "redirect:/alumno";
        }
       model.addAttribute("alumno", alumno);
       return "perfil-alumno";
    }
    
}
