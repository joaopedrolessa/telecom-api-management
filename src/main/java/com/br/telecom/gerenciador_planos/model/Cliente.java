package com.br.telecom.gerenciador_planos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Criacao da tabela cliente no banco
@Data   // O Lombok cria os Getters e Setters
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true) // Regra de negócio: impede CPFs duplicados
    private String cpf;

    private String email;
}
