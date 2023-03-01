package com.iesam.openbank.Presentation.Forms;

import com.iesam.openbank.domain.UseCase.Transaccion.AddTransaccionUseCase;
import com.iesam.openbank.domain.models.Transaccion;

public class NewTransaccionForm {

    private Transaccion buildTransaccion1() {
        Transaccion transaccion1 = new Transaccion();
        transaccion1.setId(1);
        transaccion1.setDesc("bizum");
        transaccion1.setImporte("15€");
        transaccion1.setIngresos("0€");
        transaccion1.setPagos("15€");

        return transaccion1;

    }

    private void saveTransaccion(Transaccion transaccion1) {
        AddTransaccionUseCase addTransaccionUseCase = new AddTransaccionUseCase();
        addTransaccionUseCase.execute(transaccion1);
    }

    public void createNewTransaccion() {
        Transaccion transaccion1 = buildTransaccion1();
        saveTransaccion(transaccion1);
    }


    private Transaccion buildTransaccion2() {
        Transaccion transaccion2 = new Transaccion();
        transaccion2.setId(1);
        transaccion2.setDesc("PayPal");
        transaccion2.setImporte("250€");
        transaccion2.setIngresos("250€");
        transaccion2.setPagos("0€");

        return transaccion2;

    }

    private void saveTransaccion2(Transaccion transaccion2) {
        AddTransaccionUseCase addTransaccionUseCase = new AddTransaccionUseCase();
        addTransaccionUseCase.execute(transaccion2);
    }

    public void createNewTransaccion2() {
        Transaccion transaccion2 = buildTransaccion2();
        saveTransaccion(transaccion2);
    }

}
