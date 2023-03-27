package it.softwareInside.LezioneAcademy26.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import it.softwareInside.LezioneAcademy26.models.Musicista;
import it.softwareInside.LezioneAcademy26.services.MusicistaService;
import jakarta.validation.Valid;

@RestController
public class MusicistaController {
	
	@Autowired
	MusicistaService musicistaService;
	
	@PostMapping("/crea-musicista")
	public boolean creaCantante(@RequestBody Musicista musicista) {
		return musicistaService.creaMusicista(musicista);
	}
	
	@DeleteMapping("elimina-musicista-id")
	public Musicista deleteCantanteById(@RequestParam String cognome) {
		return musicistaService.deleteById(cognome);
	}
	
	@DeleteMapping("/elimina-musicista")
	public void deleteAllCantanti() {
		musicistaService.deleteAllMusicisti();
	}
	
	@PostMapping("/modifica-musicista")
	public Musicista updateMusicista(@RequestBody @Valid Musicista musicista) {
		return musicistaService.updateMusicista(musicista);
	}

	@GetMapping("/cerca-musicista")
	public Musicista findById(String cognome) {
		return musicistaService.findById(cognome);
	}

}
