package com.sprintBootbackendproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprintBootbackendproduct.dao.PersonaDao;
import com.sprintBootbackendproduct.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
	
//llamamos a todas las funciones para generarlas desde la BD
	@Autowired
	private PersonaDao personaDao; 
	
	@Override
	@Transactional(readOnly = false) // false porque no va a mostrar nada
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = false)// false porque no va a mostrar nada
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)// true porque si va a mostrar algo
	public Persona findById(Integer id) {
		// TODO Auto-generated method stub
		return personaDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional(readOnly = true)// true porque si va a mostrar algo
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

}
