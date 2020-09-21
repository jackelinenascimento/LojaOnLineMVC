package model;

public class Produto_Pedido {

	private int quantidade_produto;
	private int fk_produto;
	private int fk_pedido;
	
	public Produto_Pedido() {}
	
	public Produto_Pedido(int quantidade_produto, int fk_produto, int fk_pedido) {
		this.quantidade_produto = quantidade_produto;
		this.fk_produto = fk_produto;
		this.fk_pedido = fk_pedido;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public int getFk_produto() {
		return fk_produto;
	}

	public void setFk_produto(int fk_produto) {
		this.fk_produto = fk_produto;
	}

	public int getFk_pedido() {
		return fk_pedido;
	}

	public void setFk_pedido(int fk_pedido) {
		this.fk_pedido = fk_pedido;
	}	
}
