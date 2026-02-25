package com.br.telecom.gerenciador_planos.service;

import com.br.telecom.gerenciador_planos.model.Cliente;
import com.br.telecom.gerenciador_planos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        // No futuro, aqui você valida se o CPF já existe
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}