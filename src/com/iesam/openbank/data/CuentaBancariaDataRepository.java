package com.iesam.openbank.data;

import com.iesam.openbank.data.Local.ClienteFileDataSource;
import com.iesam.openbank.data.Local.CuentaBancariaFileDataSource;
import com.iesam.openbank.domain.UseCase.CuentaBancariaRepository;
import com.iesam.openbank.domain.models.CuentaBancaria;

import java.util.List;

public class CuentaBancariaDataRepository implements CuentaBancariaRepository {

    private CuentaBancariaFileDataSource localDataSource;

    public CuentaBancariaDataRepository(CuentaBancariaFileDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void save(CuentaBancaria cuentaBancaria) {

    }

    @Override
    public List<CuentaBancaria> getByID() {
        return null;
    }
}
