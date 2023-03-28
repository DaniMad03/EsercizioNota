package it.softwareInside.Esercizio2Lezione26.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.Esercizio2Lezione26.models.Team;
import it.softwareInside.Esercizio2Lezione26.services.TeamService;

@RestController
public class TeamController {
	
	@Autowired
	TeamService teamService;
	
	@PostMapping("/crea-team")
	public boolean creaTeam(@RequestBody Team team) {
		return teamService.creaTeam(team);
	}

}
