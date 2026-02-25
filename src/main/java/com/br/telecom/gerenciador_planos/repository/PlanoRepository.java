package com.br.telecom.gerenciador_planos.repository;

import com.br.telecom.gerenciador_planos.model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoRepository extends JpaRepository<Plano, Long> {
}