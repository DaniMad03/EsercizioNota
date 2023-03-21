package it.softwareInside.NoteAppLezione22.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.NoteAppLezione22.models.Nota;

@Repository
public interface NotaRepository extends CrudRepository<Nota, Integer>{

}
