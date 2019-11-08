package com.dapp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Controlador {

	@Autowired
	AlumnoService as;

	@RequestMapping("/index")
	public String getAll(Model model) {
		model.addAttribute("listadoAlumnos",as.getAll());
		return "paginaEjemplo";
		
		
		
	}
	
	
}
