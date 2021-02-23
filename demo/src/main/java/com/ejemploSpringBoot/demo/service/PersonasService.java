package com.ejemploSpringBoot.demo.service;

import java.util.List;

import com.ejemploSpringBoot.demo.model.Personas;

//Creacion de metodos a utilizar
public interface PersonasService {

	public Personas save(Personas personas);

	public void delete(Integer id);

	public Personas findById(Integer id);

	public List<Personas> findAll();
}
