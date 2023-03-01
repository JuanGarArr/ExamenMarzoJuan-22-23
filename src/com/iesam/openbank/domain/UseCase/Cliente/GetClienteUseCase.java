package com.iesam.openbank.domain.UseCase.Cliente;

import com.iesam.openbank.domain.UseCase.ClienteRepository;
import com.iesam.openbank.domain.models.Cliente;

import java.util.List;

public class GetClienteUseCase {

    private ClienteRepository clienteRepository;

    public void AddClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> execute(){
        return this.clienteRepository.getByID();
    }
}
