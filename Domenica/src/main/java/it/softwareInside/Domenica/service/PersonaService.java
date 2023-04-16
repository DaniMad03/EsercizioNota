package it.softwareInside.Domenica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.Domenica.entity.Persona;
import it.softwareInside.Domenica.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	public boolean creaPersona(Persona persona) {
		try {
			personaRepository.save(persona);
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

}
