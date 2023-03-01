package com.iesam.openbank.domain.UseCase.CuentaBancaria;

import com.iesam.openbank.domain.UseCase.CuentaBancariaRepository;
import com.iesam.openbank.domain.models.CuentaBancaria;

import java.util.List;

public class GetCuentaBancariaUseCase {

    private CuentaBancariaRepository cuentaBancariaRepository;

    public void AddCuentaBancaria(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public List<CuentaBancaria> execute(){
        return this.cuentaBancariaRepository.getByID();
    }
}
