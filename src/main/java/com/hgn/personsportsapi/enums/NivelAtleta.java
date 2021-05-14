package com.hgn.personsportsapi.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum NivelAtleta {

    AMADOR("Amador"),
    INTERMEDIARIO("Intermediário"),
    PROFISSIONAL("Profissional");

    private final String descricao;

}
