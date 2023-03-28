package it.softwareInside.Esercizio2Lezione26.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.Esercizio2Lezione26.models.Player;
import it.softwareInside.Esercizio2Lezione26.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	public boolean creaPlayer(Player player) {
		try {
			playerRepository.save(player);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
