package construccion.factorymethod.ejercio1;

public class ClienteCreditoUva extends Cliente {

	@Override
	protected Pedido crearPedido(double importe) {
		return new PedidoCreditoUVA(importe);
	}

}
