package model;

public class Telefone {
	private int id_telefone;
	private String ddd;
	private String numero;
	private int fk_cliente;
	
	public Telefone() {}
	
	public Telefone(int id_telefone, String ddd, String numero, int fk_cliente) {
		this.id_telefone = id_telefone;
		this.ddd = ddd;
		this.numero = numero;
		this.fk_cliente = fk_cliente;
	}

	public int getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
	
}
