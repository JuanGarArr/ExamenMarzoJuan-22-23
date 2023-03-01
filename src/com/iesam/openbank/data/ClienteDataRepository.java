package com.iesam.openbank.data;

import com.iesam.openbank.data.Local.ClienteFileDataSource;
import com.iesam.openbank.domain.UseCase.ClienteRepository;
import com.iesam.openbank.domain.models.Cliente;

import java.util.List;

public class ClienteDataRepository implements ClienteRepository {

        private ClienteFileDataSource localDataSource;

        public ClienteDataRepository(ClienteFileDataSource localDataSource) {
            this.localDataSource = localDataSource;
        }


    @Override
    public void save(Cliente cliente) {
        this.localDataSource.save(cliente);
    }

    @Override
    public Cliente findById(Integer clienteId) {
        return null;
    }

    @Override
    public List<Cliente> getByID() {
        return null;
    }
}

