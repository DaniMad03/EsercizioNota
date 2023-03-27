package it.softwareInside.LezioneAcademy26.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.LezioneAcademy26.Repository.MusicistaRepository;
import it.softwareInside.LezioneAcademy26.models.Musicista;
import jakarta.validation.Valid;

@Service
public class MusicistaService {
	
	@Autowired
	MusicistaRepository musicistaRepository;
	
	public boolean creaMusicista(Musicista musicista) {
		try {
			musicistaRepository.save(musicista);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public Musicista deleteById(@Valid String cognome) {
		try {
			Musicista musicistaTmp = musicistaRepository.findById(cognome).get();
			musicistaRepository.deleteById(cognome);
			return musicistaTmp;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void deleteAllMusicisti() {
		try {
			musicistaRepository.deleteAll();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Musicista updateMusicista(@Valid Musicista musicista) {
		try {
			musicistaRepository.findById(musicista.getCognome()).get();
			return musicistaRepository.save(musicista);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Musicista findById(@Valid String cognome) {
		try {
			return musicistaRepository.findById(cognome).get();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
