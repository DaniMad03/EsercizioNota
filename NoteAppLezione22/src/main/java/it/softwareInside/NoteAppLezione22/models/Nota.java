package it.softwareInside.NoteAppLezione22.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Nota {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	@NotNull(message = "Il testo non dev'essere nullo")
	@NotEmpty(message = "Il testo non dev'essere nullo")
	private String text;
	
	@NotNull(message = "L'autore non dev'essere nullo")
	@NotEmpty(message = "L'autore non dev'essere vuoto")
	private String autore;

	public Nota(@NotNull @NotEmpty String text, @NotNull @NotEmpty String autore) {
		setText(text);
		setAutore(autore);
	}
}
