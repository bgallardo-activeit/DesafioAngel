package com.ejemploSpringBoot.demo.controller;

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

import com.ejemploSpringBoot.demo.model.Personas;
import com.ejemploSpringBoot.demo.service.PersonasService;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/api")
public class PersonasController {

	@Autowired
	private PersonasService personasService;

	// Request body convierte un json a personas(objeto)
	// PostMapping inserta datos
	@PostMapping("/personas")
	public Personas save(@RequestBody Personas personas) {
		return personasService.save(personas);
	}

	@GetMapping("/personas")
	public List<Personas> personas() {
		return personasService.findAll();
	}

	// GetMapping es obtener datos, solo muestra datos
	// PathVariable captura el id para encontrar la persona
	@GetMapping("/personas/{id}")
	public Personas mostrar(@PathVariable Integer id) {
		return personasService.findById(id);
	}

	// PutMapping es para actualizar datos
	@PutMapping("/personas/{id}")
	public Personas update(@RequestBody Personas personas, @PathVariable Integer id) {

		// Encontrar la persona
		Personas personasActual = personasService.findById(id);

		// Sobreescribir el dato actual con uno nuevo
		personasActual.setNombre(personas.getNombre());
		personasActual.setFecha_nacimiento(personas.getFecha_nacimiento());

		return personasService.save(personasActual);
	}

	// DeleteMapping es para eliminar datos
	@DeleteMapping("/personas/{id}")
	public void delete(@PathVariable Integer id) {
		personasService.delete(id);
	}
}
