package estructuracion.composite.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
	
	protected List<DetallePedido> productos = new ArrayList<DetallePedido>();
	
	public void agregarDetallePedido(DetallePedido detallePedido) {
		productos.add(detallePedido);
	}
	
	public abstract double calcularTotalPedido();
	public abstract boolean agregarSubPedido(Pedido pedido);
}
