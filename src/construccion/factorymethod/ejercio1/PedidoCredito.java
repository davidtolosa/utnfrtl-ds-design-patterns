package construccion.factorymethod.ejercio1;

public class PedidoCredito extends Pedido {

	public PedidoCredito(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		if (importe >= 100000 && importe <= 500000) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void paga() {
		System.out.println("El pago de pedido a credito por: " + importe + " se ha realizado.");

	}

}
