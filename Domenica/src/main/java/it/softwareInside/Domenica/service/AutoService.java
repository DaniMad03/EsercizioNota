package it.softwareInside.Domenica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.Domenica.entity.Auto;
import it.softwareInside.Domenica.repository.AutoRepository;

@Service
public class AutoService {
	
	@Autowired
	AutoRepository autoRepository;
	
	public boolean creaAuto(Auto auto) {
		try {
			autoRepository.save(auto);
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}
	
	public List<Auto> getAll(){
		return autoRepository.findAll();
	}

}
