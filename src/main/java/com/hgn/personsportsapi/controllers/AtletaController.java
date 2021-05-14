package com.hgn.personsportsapi.controllers;

import com.hgn.personsportsapi.dto.MessageResponseDTO;
import com.hgn.personsportsapi.entities.Atleta;
import com.hgn.personsportsapi.services.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atletas")
public class AtletaController {

    @Autowired
    private AtletaService atletaService;

    @GetMapping
    public ResponseEntity<List<Atleta>> listarAtletas() {
        return ResponseEntity.ok().body(atletaService.listarAtletas());
    }

    @PostMapping
    public MessageResponseDTO salvarAtleta(@RequestBody Atleta atleta) {
        atletaService.salvar(atleta);
        return MessageResponseDTO
                .builder()
                .mensagem("Criado o atleta com o id " + atleta.getId())
                .build();
    }
}
