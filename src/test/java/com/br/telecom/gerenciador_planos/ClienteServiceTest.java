package com.br.telecom.gerenciador_planos;

import com.br.telecom.gerenciador_planos.model.Cliente;
import com.br.telecom.gerenciador_planos.repository.ClienteRepository;
import com.br.telecom.gerenciador_planos.service.ClienteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @Mock
    private ClienteRepository repository;

    @InjectMocks
    private ClienteService service;

    @Test
    void deveSalvarClienteComSucesso() {
        // Preparação (Arrange)
        Cliente cliente = new Cliente();
        cliente.setNome("João Pedro");
        when(repository.save(any(Cliente.class))).thenReturn(cliente);

        // Execução (Act)
        Cliente salvo = service.salvar(cliente);

        // Verificação (Assert)
        assertNotNull(salvo);
        assertEquals("João Pedro", salvo.getNome());
        verify(repository, times(1)).save(cliente);
    }
}