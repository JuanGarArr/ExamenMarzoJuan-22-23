package com.iesam.openbank.Presentation.Forms;

import com.iesam.openbank.domain.UseCase.Producto.AddProductoUseCase;
import com.iesam.openbank.domain.models.Producto;

public class NewProductoForm {

    private Producto buildProducto() {
        Producto hipoteca = new Producto();
        hipoteca.setCod(1);
        hipoteca.setNombre("Hipoteca");
        hipoteca.setDescripcion("muycara");
        hipoteca.setFechaFin("11/12/2023");

        return hipoteca;
    }

    private void saveProducto(Producto producto) {
        AddProductoUseCase addProductoUseCase = new AddProductoUseCase();
        addProductoUseCase.execute(producto);
    }

    public void createNewProducto() {
        Producto producto = buildProducto();
        saveProducto(producto);
    }
}
