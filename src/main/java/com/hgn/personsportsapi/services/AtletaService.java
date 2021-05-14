package com.hgn.personsportsapi.services;

import com.hgn.personsportsapi.entities.Atleta;
import com.hgn.personsportsapi.repositories.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public List<Atleta> listarAtletas() {
        return atletaRepository.findAll();
    }

    public Atleta salvar(Atleta atleta) {
        return atletaRepository.save(atleta);
    }
}
