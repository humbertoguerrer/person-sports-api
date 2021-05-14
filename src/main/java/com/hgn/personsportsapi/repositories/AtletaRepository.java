package com.hgn.personsportsapi.repositories;

import com.hgn.personsportsapi.entities.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtletaRepository extends JpaRepository<Atleta, Long> {
}
