package com.byrohchiproyect.persona.service;

import java.util.List;

import com.byrohchiproyect.persona.model.Persona;

public interface PersonaService {

	public Persona save(Persona persona);
	
	public void delete(Integer id);
	
	public Persona findById(Integer id);
	
	public List<Persona> findAll();
}
