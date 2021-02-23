package com.ejemploSpringBoot.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejemploSpringBoot.demo.model.Personas;

//CrudRepository contiene todos los metodos del crud
public interface PersonasDao extends CrudRepository<Personas, Integer>{

}
