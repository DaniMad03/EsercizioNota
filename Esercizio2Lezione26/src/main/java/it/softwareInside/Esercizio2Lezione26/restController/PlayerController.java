package it.softwareInside.Esercizio2Lezione26.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.Esercizio2Lezione26.models.Player;
import it.softwareInside.Esercizio2Lezione26.services.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@PostMapping("/crea-player")
	public boolean creaPlayer(@RequestBody Player player) {
		return playerService.creaPlayer(player);
	}

}
