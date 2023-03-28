package it.softwareInside.Esercizio2Lezione26.models;

import jakarta.persistence.Entity;
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
public class Player {
	
	@Id
	private String nome;
	
	@NotNull
	private String ruolo;
	
	@NotNull
	private int eta;

}
