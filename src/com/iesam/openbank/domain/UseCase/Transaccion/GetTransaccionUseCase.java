package com.iesam.openbank.domain.UseCase.Transaccion;

import com.iesam.openbank.domain.UseCase.TransaccionRepository;
import com.iesam.openbank.domain.models.Transaccion;

import java.util.List;

public class GetTransaccionUseCase {

    private TransaccionRepository transaccionRepository;
    public void AddTransaccionUseCase(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository  ;
    }
    public List<Transaccion> execute(){
        return this.transaccionRepository.getByID();
    }
}
