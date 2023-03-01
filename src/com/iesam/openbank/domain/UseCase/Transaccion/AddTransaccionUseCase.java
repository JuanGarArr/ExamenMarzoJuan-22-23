package com.iesam.openbank.domain.UseCase.Transaccion;

import com.iesam.openbank.domain.UseCase.TransaccionRepository;
import com.iesam.openbank.domain.models.Transaccion;

public class AddTransaccionUseCase {

    private TransaccionRepository transaccionRepository;
    public void AddTransaccionUseCase(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository  ;
    }

    public void execute(Transaccion transaccion) {
        transaccionRepository.save(transaccion);
    }
}
