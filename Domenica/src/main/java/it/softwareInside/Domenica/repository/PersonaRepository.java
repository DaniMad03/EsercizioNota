package it.softwareInside.Domenica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.Domenica.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
