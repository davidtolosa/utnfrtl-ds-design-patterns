package construccion.factorymethod.ejercio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

	protected List<Pedido> pedidos = new ArrayList<Pedido>();
	
	protected abstract Pedido crearPedido(double importe);
	
	public void nuevoPedido(double importe) {
		Pedido pedido = crearPedido(importe);
		if(pedido.valida()) {
			pedido.paga();
			pedidos.add(pedido);
		}
	}
}
