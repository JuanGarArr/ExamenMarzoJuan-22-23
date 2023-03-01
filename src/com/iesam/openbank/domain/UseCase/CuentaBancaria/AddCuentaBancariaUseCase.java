package com.iesam.openbank.domain.UseCase.CuentaBancaria;

import com.iesam.openbank.domain.UseCase.CuentaBancariaRepository;
import com.iesam.openbank.domain.models.CuentaBancaria;

public class AddCuentaBancariaUseCase {

    private CuentaBancariaRepository cuentaBancariaRepository;

    public void AddCuentaBancariaUseCase(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public void execute(CuentaBancaria cuentaBancaria) {
        cuentaBancariaRepository.save(cuentaBancaria);
    }
}
