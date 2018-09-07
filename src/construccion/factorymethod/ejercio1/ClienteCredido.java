package construccion.factorymethod.ejercio1;

public class ClienteCredido extends Cliente {

	@Override
	protected Pedido crearPedido(double importe) {
		return new PedidoCredito(importe);
	}

}
