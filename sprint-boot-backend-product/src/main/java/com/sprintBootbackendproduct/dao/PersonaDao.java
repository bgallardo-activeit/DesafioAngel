package com.sprintBootbackendproduct.dao;

import org.springframework.data.repository.CrudRepository;

import com.sprintBootbackendproduct.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Integer> {

}
