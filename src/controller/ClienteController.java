package controller;

import java.time.LocalDate;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	
	private Cliente model;
	private ClienteView view;
	
	public ClienteController() {}
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}

	public int getClienteId_cliente() {
		return model.getId_cliente();
	}
	
	public String getClienteNome() {
		return model.getNome();
	}
	
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	
	public String getClienteCPF() {
		return model.getCpf();
	}
	
	public void setClienteCPF(String cpf) {
		model.setCpf(cpf);
	}
	
	public String getClienteRG() {
		return model.getRg();
	}
	
	public void setClienteRG(String rg) {
		model.setRg(rg);
	}
	
	public String getClienteEmail() {
		return model.getEmail();
	}
	
	public void setClienteEmail(String email) {
		model.setEmail(email);
	}
	
	public LocalDate getClienteDataNascimento() {
		return model.getData_nascimento();
	}
	
	public void setClienteDataNascimento(LocalDate data) {
		model.setData_nascimento(data);
	}
	
	public void updateView() {
		view.printClienteDetails(model.getId_cliente(), model.getNome(), model.getCpf(),model.getRg(),model.getEmail(), model.getData_nascimento());
	}
}
