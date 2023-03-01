package com.iesam.openbank.Presentation;


import com.iesam.openbank.Presentation.Forms.NewClienteForm;
import com.iesam.openbank.Presentation.Forms.NewCuentabancariaForm;
import com.iesam.openbank.Presentation.Forms.NewProductoForm;
import com.iesam.openbank.Presentation.Forms.NewTransaccionForm;

public class MenuView {

    public void init() {
        // createNewClientForm();
        // showClient();
    }

    private void createNewClientForm() {
        NewClienteForm newClienteForm = new NewClienteForm();
        newClienteForm.createNewCliente();
    }

    private void createNewCuentaBancariaForm() {
        NewCuentabancariaForm newCuentabancariaForm = new NewCuentabancariaForm();
        newCuentabancariaForm.createNewCuentaBancaria();
    }

    private void createNewProductoForm() {
        NewProductoForm newProductoForm = new NewProductoForm();
        newProductoForm.createNewProducto();
    }

    private void createNewTransaccionForm() {
        NewTransaccionForm newTransaccionForm = new NewTransaccionForm();
        newTransaccionForm.createNewTransaccion();
    }
    private void createNewTransaccion2Form() {
        NewTransaccionForm newTransaccionForm = new NewTransaccionForm();
        newTransaccionForm.createNewTransaccion2();
    }

}
