package com.br.telecom.gerenciador_planos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePlano;
    private Double valor;
    private String franquiaDados;
}