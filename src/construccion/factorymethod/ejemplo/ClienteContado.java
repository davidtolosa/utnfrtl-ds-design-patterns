package construccion.factorymethod.ejemplo;

public class ClienteContado extends Cliente {

	@Override
	protected Pedido crearPedido(double importe) {
		return new PedidoContado(importe);
	}

}
