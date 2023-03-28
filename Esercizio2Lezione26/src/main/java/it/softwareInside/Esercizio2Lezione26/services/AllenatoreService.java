package it.softwareInside.Esercizio2Lezione26.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.softwareInside.Esercizio2Lezione26.models.Allenatore;
import it.softwareInside.Esercizio2Lezione26.repository.AllenatoreRepository;

@Repository
public class AllenatoreService {

	@Autowired
	AllenatoreRepository allenatoreRepository;
	
	public boolean creaAllenatore(Allenatore allenatore) {
		try {
			allenatoreRepository.save(allenatore);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
