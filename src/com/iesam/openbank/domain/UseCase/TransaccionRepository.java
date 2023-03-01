package com.iesam.openbank.domain.UseCase;

import com.iesam.openbank.domain.models.Transaccion;

import java.util.List;

public interface TransaccionRepository {

    public void save(Transaccion transaccion);

    public Transaccion findById(Integer transaccionId);

    public List<Transaccion> getByID();
}
