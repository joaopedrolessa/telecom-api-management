package com.br.telecom.gerenciador_planos.controller;

import com.br.telecom.gerenciador_planos.model.Plano;
import com.br.telecom.gerenciador_planos.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planos")
public class PlanoController {

    @Autowired
    private PlanoService service;

    @PostMapping
    public Plano criar(@RequestBody Plano plano) {
        return service.salvar(plano);
    }

    @GetMapping
    public List<Plano> buscarTodos() {
        return service.listarTodos();
    }
}