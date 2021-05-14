package com.hgn.personsportsapi.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum TipoEsporte {

    CORRIDA("Corrida"),
    CICLISMO("Ciclismo"),
    NATACAO("Natação"),
    FUTEBOL("Futebol"),
    BASQUETE("Basquete"),
    MUSCULACAO("Musculação"),
    PILATES("Pilates");

    private final String descricao;

}
