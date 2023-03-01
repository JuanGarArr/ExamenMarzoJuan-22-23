package com.iesam.openbank.domain.UseCase.Producto;

import com.iesam.openbank.domain.UseCase.ProductoRepository;
import com.iesam.openbank.domain.models.Producto;

public class AddProductoUseCase {

    private ProductoRepository productoRepository;

    public void AddProductoUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void execute(Producto producto) {
        productoRepository.save(producto);
    }
}
