package it.softwareInside.Esercizio2Lezione26.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.Esercizio2Lezione26.models.Allenatore;
import it.softwareInside.Esercizio2Lezione26.services.AllenatoreService;

@RestController
public class AllenatoreController {
	
	@Autowired
	AllenatoreService allenatoreService;
	
	@PostMapping("/crea-allenatore")
	public boolean creaAllenatore(@RequestBody Allenatore allenatore) {
		return allenatoreService.creaAllenatore(allenatore);
	}

}
