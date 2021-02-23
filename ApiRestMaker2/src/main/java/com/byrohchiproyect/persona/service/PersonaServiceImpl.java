package com.byrohchiproyect.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byrohchiproyect.persona.dao.PersonaDao;
import com.byrohchiproyect.persona.model.Mensajes;
import com.byrohchiproyect.persona.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService{

	Mensajes mensaje = new Mensajes();
	@Autowired
	private PersonaDao personaDao;
	
	@Override
	@Transactional(readOnly = false)
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Integer id) {
		// TODO Auto-generated method stub
		return personaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

}
