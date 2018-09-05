package construccion.factorymethod.ejemplo;

public abstract class Pedido {

	protected double importe;
	
	public Pedido(double importe) {
		this.importe = importe;
	}
	
	public abstract boolean valida();
	public abstract void paga();
}
