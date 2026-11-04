package com.daw.prueba2.controladoras;



import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;




@RestController  
public class miprimeracontroladora {
@GetMapping("comprobar")
public String comprobat () {
    return "comprobado";
}
@GetMapping("/")
public String inicio() {
    return "estas en la raiz de la aplicacion";
}
@GetMapping("/damelahora")
public String devuelvelahora() { //devuelve la hora del servidor
    LocalTime hora = LocalTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");


    return "hora del servidor:" + hora.format(formato);
}

}
