package com.br.telecom.gerenciador_planos.service;

import com.br.telecom.gerenciador_planos.model.Plano;
import com.br.telecom.gerenciador_planos.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano) {
        return repository.save(plano);
    }

    public List<Plano> listarTodos() {
        return repository.findAll();
    }
}