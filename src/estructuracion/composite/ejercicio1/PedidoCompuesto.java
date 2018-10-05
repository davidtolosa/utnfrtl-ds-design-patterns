package estructuracion.composite.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PedidoCompuesto extends Pedido {
	
	protected List<Pedido> subpedidos = new ArrayList<Pedido>();

	@Override
	public double calcularTotalPedido() {

		//Calculo el total de los subpedidos
		double totalSubpedidos = 0;
				
		for(Pedido subpedido:subpedidos) {
			totalSubpedidos = totalSubpedidos + subpedido.calcularTotalPedido();
		}		
		
		//Calculo el total del pedido
		double totalPedido=0;
		
		for(DetallePedido producto:productos) {
			totalPedido = totalPedido + (producto.cantidad*producto.precioUnitario);
		}		
		
		return totalPedido + totalSubpedidos;
	}

	@Override
	public boolean agregarSubPedido(Pedido pedido) {
		return subpedidos.add(pedido);
	}

}
