package com.byrohchiproyect.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byrohchiproyect.persona.model.Persona;
import com.byrohchiproyect.persona.service.PersonaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@PostMapping("/personas")
	public Persona save(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@GetMapping("/personas")
	public List<Persona> personas(){
		return personaService.findAll();
	}
	
	@GetMapping("/personas/{id}")
	public Persona mostrar(@PathVariable Integer id){
		return personaService.findById(id);
	}
	
	@PutMapping("/personas/{id}")
	public Persona update(@RequestBody Persona persona, @PathVariable Integer id){
		Persona personaActual= personaService.findById(id);
		personaActual.setNombre(persona.getNombre());
		personaActual.setFecha_nacimiento(persona.getFecha_nacimiento());
		return personaService.save(personaActual);
	}
	
	@DeleteMapping("/personas/{id}")
	public void delete (@PathVariable Integer id) {
		personaService.delete(id);
	}
}
