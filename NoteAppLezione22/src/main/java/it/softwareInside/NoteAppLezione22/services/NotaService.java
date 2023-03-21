package it.softwareInside.NoteAppLezione22.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.NoteAppLezione22.models.Nota;
import it.softwareInside.NoteAppLezione22.repository.NotaRepository;
import jakarta.validation.Valid;

@Service
public class NotaService {
	
	@Autowired
	NotaRepository notaRepository;

	
	public boolean creaNota(@Valid Nota nota) {
		
		try {
			
			notaRepository.save(nota);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public Iterable<Nota> getAllData(){
		
		try {
			
			return notaRepository.findAll();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	public Nota deleteByYd(int id) {
		
		try {
			
			Nota nota = notaRepository.findById(id).get();
			
			notaRepository.deleteById(id);
			
			return nota;
			
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean deleteAllData() {
		
		try {
			
			notaRepository.deleteAll();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public Nota update(@Valid Nota nota) {
		
		notaRepository.findById(nota.getId()).get();
		return notaRepository.save(nota);
	}
	
	public Nota findById(int id) {
		
		try {
			
			return notaRepository.findById(id).get();
			
		} catch (Exception e) {
			return null;
		}
	}
	
}
