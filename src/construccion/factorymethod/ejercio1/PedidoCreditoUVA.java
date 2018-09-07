package construccion.factorymethod.ejercio1;

public class PedidoCreditoUVA extends Pedido {

	public PedidoCreditoUVA(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		if (importe < 400000)
			return true;
		else
			return false;
	}

	@Override
	public void paga() {
		System.out.println("El pago de pedido a credito UVA por: " + importe + " se ha realizado.");

	}

}
