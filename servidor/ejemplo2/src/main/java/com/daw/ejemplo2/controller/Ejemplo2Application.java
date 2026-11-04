package com.daw.ejemplo2;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller 
public class Ejemplo2Application {

	@GetMapping("./ejercicio2")
	public String gejecicio2(Model modelo) {
			producto  a = new producto("llave", 25.5);
			modelo.addAttribute("producto", a);

		return "ejercicio2";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2Application.class, args);
	}

}
