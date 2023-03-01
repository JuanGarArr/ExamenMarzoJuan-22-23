package com.iesam.openbank.Presentation.Forms;

import com.iesam.openbank.domain.UseCase.CuentaBancaria.AddCuentaBancariaUseCase;
import com.iesam.openbank.domain.models.CuentaBancaria;
import com.iesam.openbank.domain.models.Hipoteca;

public class NewCuentabancariaForm {

    private CuentaBancaria buildCuentaBancaria() {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setTitular(cuentaBancaria.getTitular());
        cuentaBancaria.setNumCuenta(123456789);
        cuentaBancaria.setProducto(cuentaBancaria.getProducto());
        cuentaBancaria.setSaldo("3€");

        return cuentaBancaria;

    }

    private void saveCuentaBancaria(CuentaBancaria cuentaBancaria) {
        AddCuentaBancariaUseCase addCuentaBancariaUseCase = new AddCuentaBancariaUseCase();
        addCuentaBancariaUseCase.execute(cuentaBancaria);
    }

    public void createNewCuentaBancaria() {
        CuentaBancaria cuentaBancaria = buildCuentaBancaria();
        saveCuentaBancaria(cuentaBancaria);
    }
}
