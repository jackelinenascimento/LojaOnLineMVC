package view;

import controller.ClienteController;
import model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente modelCliente = new Cliente();
		ClienteView viewCliente = new ClienteView();
		ClienteController controllerCliente = new ClienteController(modelCliente, viewCliente);
		
		controllerCliente.setClienteNome("Jackeline");
		controllerCliente.setClienteEmail("jackeline@email.com");
		controllerCliente.setClienteCPF("111.111.111-11");
		controllerCliente.setClienteRG("22.222.222-2");
		
		controllerCliente.updateView();


	}

}
