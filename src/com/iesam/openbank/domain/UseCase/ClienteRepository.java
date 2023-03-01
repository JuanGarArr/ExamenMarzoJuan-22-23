package com.iesam.openbank.domain.UseCase;

import com.iesam.openbank.domain.models.Cliente;

import java.util.List;

public interface ClienteRepository {

    public void save(Cliente cliente);

    public Cliente findById(Integer clienteId);

    public List<Cliente> getByID();
}
