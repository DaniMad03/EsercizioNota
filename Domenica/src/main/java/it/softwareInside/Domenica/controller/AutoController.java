package it.softwareInside.Domenica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.Domenica.entity.Auto;
import it.softwareInside.Domenica.service.AutoService;

@RestController
public class AutoController {
	
	@Autowired
	AutoService autoService;
	
	@PostMapping("/crea-auto")
	public boolean creaAuto(@RequestBody Auto auto) {
		return autoService.creaAuto(auto);
	}
	
	@GetMapping("/find-all")
	public List<Auto> getAll(){
		return autoService.getAll();
	}

}
