package com.sprintBootbackendproduct.controller;

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

import com.sprintBootbackendproduct.model.Persona;
import com.sprintBootbackendproduct.service.PersonaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService; // llamamos a personaService porque este tiene como hijo a personaServiceImpl
	
	//retornaremos a una persona en Json- RequestBody convierte el json a una persona "normal", mas legible
	@PostMapping("/personas")   //para mostrar datos dej json
	public  Persona save(@RequestBody Persona persona) {
	return personaService.save(persona);
	}
	
	@GetMapping("/personas")
	public List<Persona> verPersonas(){
		return personaService.findAll();
	}
	
	@GetMapping("/persona/{id}")
	public Persona mostrarPorId(@PathVariable Integer id) {
		return personaService.findById(id);
	}
	
	@PutMapping("/persona/{id}")
	public Persona actualizar(@RequestBody Persona persona, @PathVariable Integer id) {
		
		Persona personaActual = personaService.findById(id);
		
		personaActual.setNombre(persona.getNombre());
		personaActual.setFecha_nacimiento(persona.getFecha_nacimiento());
		personaActual.setEdad(persona.getId());
	
		return personaService.save(personaActual);
	}
	
	@DeleteMapping("/persona/{id}")
	public void eliminar( @PathVariable Integer id) {
		 personaService.findById(id);
	}
	
	
	
}
