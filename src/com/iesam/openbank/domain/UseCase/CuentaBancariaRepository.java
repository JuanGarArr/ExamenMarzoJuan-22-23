package com.iesam.openbank.domain.UseCase;

import com.iesam.openbank.domain.models.CuentaBancaria;

import java.util.List;

public interface CuentaBancariaRepository {

    public void save(CuentaBancaria cuentaBancaria);

    public List<CuentaBancaria> getByID();
}
