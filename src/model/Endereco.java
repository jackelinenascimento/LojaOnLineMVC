package model;

public class Endereco {
	private int id_endereco;
	private int numero;
	private String rua; 
	private String bairro; 
	private String complemento;
	private String cidade;
	private String estado;
	private int fk_cliente;
	
	public Endereco() {}
	
	public Endereco(int id_endereco, int numero, String rua, String bairro, String complemento, String cidade,
			String estado, int fk_cliente) {
		this.id_endereco = id_endereco;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.fk_cliente = fk_cliente;
	}

	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
}
