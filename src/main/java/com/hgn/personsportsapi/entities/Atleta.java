package com.hgn.personsportsapi.entities;

import lombok.*;

import javax.persistence.*;
import java.time.*;
import java.util.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private LocalDate nascimento;

    @Column(nullable = false)
    private Double altura;

    @Column(nullable = false)
    private Double peso;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    List<Esporte> esportes = new ArrayList<>();

}
