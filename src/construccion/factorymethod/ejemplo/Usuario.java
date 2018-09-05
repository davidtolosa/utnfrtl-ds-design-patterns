package construccion.factorymethod.ejemplo;

public class Usuario {

	public static void main(String[] args) {
		
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(100000);
		cliente.nuevoPedido(500000);
		
		cliente = new ClienteCredido();
		cliente.nuevoPedido(100);
		cliente.nuevoPedido(500000);
	}

}
