package it.softwareInside.Esercizio2Lezione26.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.Esercizio2Lezione26.models.Team;
import it.softwareInside.Esercizio2Lezione26.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	TeamRepository teamRepository;
	
	public boolean creaTeam(Team team) {
		try {
			teamRepository.save(team);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
