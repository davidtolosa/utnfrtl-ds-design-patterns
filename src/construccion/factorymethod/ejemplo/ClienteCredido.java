package construccion.factorymethod.ejemplo;

public class ClienteCredido extends Cliente {

	@Override
	protected Pedido crearPedido(double importe) {
		return new PedidoCredito(importe);
	}

}
