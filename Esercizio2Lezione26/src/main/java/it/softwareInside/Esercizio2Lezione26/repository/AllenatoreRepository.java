package it.softwareInside.Esercizio2Lezione26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.Esercizio2Lezione26.models.Allenatore;

@Repository
public interface AllenatoreRepository extends JpaRepository<Allenatore, String>{

}
