package com.br.telecom.gerenciador_planos.controller;

import com.br.telecom.gerenciador_planos.model.Cliente;
import com.br.telecom.gerenciador_planos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> buscarTodos() {
        return service.listarTodos();
    }
}
