package com.spring.practica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.practica.modelo.Persona;

@Service
public interface PersonaService {
	public List<Persona>listarPersona();
	public Optional<Persona>listarId(int id);
	public int guardarNuevaPersona(Persona persona);
	public void eliminarPersona(int id);

}
