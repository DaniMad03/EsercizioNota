package it.softwareInside.Domenica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.Domenica.entity.Persona;
import it.softwareInside.Domenica.service.PersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@PostMapping("/crea-persona")
	public boolean creaPersona(@RequestBody Persona persona) {
		return personaService.creaPersona(persona);
	}

}
