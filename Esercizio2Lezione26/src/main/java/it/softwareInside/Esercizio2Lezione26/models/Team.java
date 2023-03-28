package it.softwareInside.Esercizio2Lezione26.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {
	
	
	@Id
	private String nome;
	
	@NotNull
	private int trofeiVinti;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "COGNOME_ALLENATORE")
	private Allenatore allenatore;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Player> players;

}
