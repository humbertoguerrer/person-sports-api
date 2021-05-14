package com.hgn.personsportsapi.repositories;

import com.hgn.personsportsapi.entities.Esporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsporteRepository extends JpaRepository<Esporte, Long> {
}
