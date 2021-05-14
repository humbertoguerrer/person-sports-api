package com.hgn.personsportsapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NivelAtleta {

    AMADOR("Amador"),
    INTERMEDIARIO("Intermediário"),
    PROFISSIONAL("Profissional");

    private final String descricao;

}
