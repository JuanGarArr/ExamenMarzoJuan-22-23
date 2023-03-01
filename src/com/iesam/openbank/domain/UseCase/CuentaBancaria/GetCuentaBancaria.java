package com.iesam.openbank.domain.UseCase.CuentaBancaria;

import com.iesam.openbank.domain.UseCase.ClienteRepository;
import com.iesam.openbank.domain.UseCase.CuentaBancariaRepository;
import com.iesam.openbank.domain.models.Cliente;
import com.iesam.openbank.domain.models.CuentaBancaria;

import java.util.List;

public class GetCuentaBancaria {

    private CuentaBancariaRepository cuentaBancariaRepository;

    public void AddCuentaBancaria(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public List<CuentaBancaria> execute(){
        return this.cuentaBancariaRepository.getByID();
    }
}
