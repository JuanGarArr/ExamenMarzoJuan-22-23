package com.iesam.openbank.domain.UseCase.Cliente;

import com.iesam.openbank.domain.UseCase.ClienteRepository;
import com.iesam.openbank.domain.models.Cliente;

public class AddClienteUseCase {
    private ClienteRepository clienteRepository;

    public void AddClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void execute(Cliente cliente) {
        clienteRepository.save(cliente);
    }

}
