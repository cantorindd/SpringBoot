package com.spring.practica.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.practica.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

	
}
