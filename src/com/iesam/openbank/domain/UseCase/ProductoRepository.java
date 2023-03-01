package com.iesam.openbank.domain.UseCase;

import com.iesam.openbank.domain.models.CuentaBancaria;
import com.iesam.openbank.domain.models.Producto;

import java.util.List;

public interface ProductoRepository {
    public void save(Producto producto);
    public List<Producto> getByID();

}
