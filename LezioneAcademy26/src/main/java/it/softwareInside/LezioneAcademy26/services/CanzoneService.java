package it.softwareInside.LezioneAcademy26.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.LezioneAcademy26.Repository.CanzoneRepository;
import it.softwareInside.LezioneAcademy26.models.Canzone;
import jakarta.validation.Valid;

@Service
public class CanzoneService {

	@Autowired
	CanzoneRepository canzoneRepository;
	
	public boolean creaCanzone(Canzone canzone) {
		try {
			canzoneRepository.save(canzone);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public Canzone deleteCanzoneById(@Valid String titolo) {
		try {
			Canzone canzoneTmp = canzoneRepository.findById(titolo).get();
			canzoneRepository.deleteById(titolo);
			return canzoneTmp;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
