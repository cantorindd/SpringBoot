package com.spring.practica.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.practica.modelo.Persona;
import com.spring.practica.services.impl.PersonaServiceImpl;

@Controller
@RequestMapping
public class PersonaController {
	
	@Autowired
	private PersonaServiceImpl personaServiceImpl;
	@GetMapping("/listar")
	public String listar(Model model){
		List<Persona> listarPersonas = personaServiceImpl.listarPersona();
		model.addAttribute("listarPersonas", listarPersonas);
		return "persona";
	}
}
