package construccion.factorymethod.ejercio1;

public class ClientePlanAhorro extends Cliente {

	@Override
	protected Pedido crearPedido(double importe) {
		// TODO Auto-generated method stub
		return new PedidoPlanAhorro(importe);
	}

}
