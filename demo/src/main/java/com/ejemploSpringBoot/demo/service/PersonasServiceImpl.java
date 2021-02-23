package com.ejemploSpringBoot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemploSpringBoot.demo.dao.PersonasDao;
import com.ejemploSpringBoot.demo.model.Personas;

@Service
public class PersonasServiceImpl implements PersonasService {
	
	@Autowired
	private PersonasDao personasDao;

	@Override
	@Transactional(readOnly = false)
	public Personas save(Personas personas) {
		// TODO Auto-generated method stub
		return personasDao.save(personas);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		personasDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Personas findById(Integer id) {
		// TODO Auto-generated method stub
		return personasDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Personas> findAll() {
		// TODO Auto-generated method stub
		return (List<Personas>) personasDao.findAll();
	}

}
