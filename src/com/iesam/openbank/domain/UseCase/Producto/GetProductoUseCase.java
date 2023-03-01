package com.iesam.openbank.domain.UseCase.Producto;

import com.iesam.openbank.domain.UseCase.ProductoRepository;
import com.iesam.openbank.domain.models.Producto;

import java.util.List;

public class GetProductoUseCase {

    private ProductoRepository productoRepository;

    public void AddProductoUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> execute(){
        return this.productoRepository.getByID();
    }
}
