package com.br.telecom.gerenciador_planos.repository;

import com.br.telecom.gerenciador_planos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aqui o Spring já nos dá: save(), findAll(), findById(), delete()
}