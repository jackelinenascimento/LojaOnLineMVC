package view;

public class TelefoneView {
	public void printTelefoneDetails(int id_telefone, String ddd, String numero, int fk_cliente) {
		System.out.println("Telefone: ");
		System.out.println("Id: " + id_telefone);
		System.out.println("DDD: " + ddd);
		System.out.println("Número: " + numero);
		System.out.println("Cliente: " + fk_cliente);
	} 
}
