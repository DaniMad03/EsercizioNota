package it.softwareInside.LezioneAcademy26.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.LezioneAcademy26.models.Canzone;
import it.softwareInside.LezioneAcademy26.services.CanzoneService;

@RestController
public class CanzoneController {
	
	@Autowired
	CanzoneService canzoneService;
	
	@PostMapping("/crea-canzone")
	public boolean creaCanzone(@RequestBody Canzone canzone) {
		return canzoneService.creaCanzone(canzone);
	}
	
	@DeleteMapping("/delete-by-id")
	public Canzone deleteCanzoneById(@RequestParam String titolo) {
		return canzoneService.deleteCanzoneById(titolo);
	}

}
