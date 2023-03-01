package com.iesam.openbank.data;

import com.iesam.openbank.data.Local.TransaccionFileDataSource;
import com.iesam.openbank.domain.UseCase.TransaccionRepository;
import com.iesam.openbank.domain.models.Transaccion;

import java.util.List;

public class TransaccionDataRepository implements TransaccionRepository {

    private TransaccionFileDataSource localDataSource;

    public TransaccionDataRepository(TransaccionFileDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }


    @Override
    public void save(Transaccion transaccion) {
        this.localDataSource.save(transaccion);
    }

    @Override
    public Transaccion findById(Integer transaccionId) {
        return null;
    }

    @Override
    public List<Transaccion> getByID() {
        return null;
    }
}
