package com.iesam.openbank.Presentation.Forms;

import com.iesam.openbank.domain.UseCase.Cliente.AddClienteUseCase;
import com.iesam.openbank.domain.models.Cliente;

public class NewClienteForm {

    private Cliente buildCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("hola");
        cliente.setApellidos("no");
        cliente.setDni("asdad");
        cliente.setDireccion("asdasd");

        return cliente;
    }

    private void saveCliente(Cliente cliente) {
        AddClienteUseCase addClienteUseCase = new AddClienteUseCase();
        addClienteUseCase.execute(cliente);
    }

    public void createNewCliente() {
        Cliente cliente = buildCliente();
        saveCliente(cliente);
    }
}
