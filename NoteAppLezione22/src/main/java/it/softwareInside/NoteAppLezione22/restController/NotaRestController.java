package it.softwareInside.NoteAppLezione22.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.NoteAppLezione22.models.Nota;
import it.softwareInside.NoteAppLezione22.services.NotaService;

@RestController
public class NotaRestController {
	
	@Autowired
	NotaService notaService;
	
	@PostMapping("/crea-nota")
	public boolean creaNota(@RequestBody Nota nota) {
		
		return notaService.creaNota(nota);
	}
	
	@GetMapping("/mostra-tutto")
	public Iterable<Nota> getAllData(){
		
		return notaService.getAllData();
	}
	
	@DeleteMapping("/elimina-nota")
	public Nota deleteById(@RequestParam("id") int id) {
		
		return notaService.deleteByYd(id);
	}
	
	@GetMapping("/elimina-tutto")
	public boolean deleteAllData() {
		
		return notaService.deleteAllData();
	}
	
	@PostMapping("/modifica-nota")
	public Nota update(@RequestBody Nota nota) {
		
		return notaService.update(nota);
	}
	
	@GetMapping("/cerca-id")
	public Nota findById(@RequestParam int id) {
		
		return notaService.findById(id);
	}

}
