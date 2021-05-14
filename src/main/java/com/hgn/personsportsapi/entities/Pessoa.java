package com.hgn.personsportsapi.entities;

import lombok.*;

import java.time.*;
import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate nascimento;

    List<Esporte> esportes = new ArrayList<>();



}
