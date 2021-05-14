package com.hgn.personsportsapi.entities;

import com.hgn.personsportsapi.enums.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Esporte {

    private Long id;
    private String nome;
    private TipoEsporte esporte;
}
