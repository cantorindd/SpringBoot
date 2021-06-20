package com.spring.practica.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practica.interfaces.IPersona;
import com.spring.practica.modelo.Persona;
import com.spring.practica.services.PersonaService;

@Service(value="PersonaService")
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private IPersona iPersona;
	
	@Override
	public List<Persona> listarPersona() {
		
		return (List<Persona>) iPersona.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {

		return null;
	}

	@Override
	public int guardarNuevaPersona(Persona persona) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminarPersona(int id) {
		// TODO Auto-generated method stub
		
	}

}
