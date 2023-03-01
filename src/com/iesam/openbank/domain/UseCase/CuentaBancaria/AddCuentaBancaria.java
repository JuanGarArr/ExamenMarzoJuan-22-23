package com.iesam.openbank.domain.UseCase.CuentaBancaria;

import com.iesam.openbank.domain.UseCase.CuentaBancariaRepository;
import com.iesam.openbank.domain.models.CuentaBancaria;

public class AddCuentaBancaria {

    private CuentaBancariaRepository cuentaBancariaRepository;

    public void AddCuentaBancaria(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public void execute(CuentaBancaria cuentaBancaria) {
        cuentaBancariaRepository.save(cuentaBancaria);
    }
}
