package it.softwareInside.Domenica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.Domenica.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer>{

}
