package com.iesam.openbank.data;

import com.iesam.openbank.data.Local.ProductoFileDataSource;
import com.iesam.openbank.domain.UseCase.ProductoRepository;
import com.iesam.openbank.domain.models.Producto;

import java.util.List;

public class ProductoDataRepository implements ProductoRepository {

    private ProductoFileDataSource localDataSource;

    public ProductoDataRepository(ProductoFileDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void save(Producto producto) {

    }

    @Override
    public List<Producto> getByID() {
        return null;
    }

}
