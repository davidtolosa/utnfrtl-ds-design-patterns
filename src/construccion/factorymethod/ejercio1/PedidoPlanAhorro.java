package construccion.factorymethod.ejercio1;

public class PedidoPlanAhorro extends Pedido {

	public PedidoPlanAhorro(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		if (importe < 600000)
			return true;
		else
			return false;
	}

	@Override
	public void paga() {
		System.out.println("El pago de pedido a Plan De Ahorro por: " + importe + " se ha realizado.");

	}

}
