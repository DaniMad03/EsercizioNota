package it.softwareInside.LezioneAcademy26.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.LezioneAcademy26.models.Musicista;

@Repository
public interface MusicistaRepository extends JpaRepository<Musicista, String>{

}
