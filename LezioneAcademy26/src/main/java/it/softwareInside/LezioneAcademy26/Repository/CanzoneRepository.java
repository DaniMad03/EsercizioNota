package it.softwareInside.LezioneAcademy26.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.LezioneAcademy26.models.Canzone;

@Repository
public interface CanzoneRepository extends JpaRepository<Canzone, String>{

}
