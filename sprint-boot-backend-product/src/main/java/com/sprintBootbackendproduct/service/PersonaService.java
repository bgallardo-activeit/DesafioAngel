package com.sprintBootbackendproduct.service;

import java.util.List;

import com.sprintBootbackendproduct.model.Persona;

public interface PersonaService {


	/* Hacemos el metodo insertar y guardar*/
	
	public Persona save(Persona persona);
	
	/* Hacemos el metodo para eliminar*/
	
	public void delete(Integer id);
	
	/* Hacemos el metodo para actualizar*/
	
	public Persona findById(Integer id);

	/* Hacemos el metodo para encontrar la lista*/
	
	public List<Persona> findAll();
	
	
}
