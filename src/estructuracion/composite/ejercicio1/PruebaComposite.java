package estructuracion.composite.ejercicio1;

public class PruebaComposite {

	public static void main(String[] args) {
		
		Pedido pedidoSimple2= new PedidoSimple();
		pedidoSimple2.agregarDetallePedido(new DetallePedido("PR5", 2, 10));
		
		System.out.println("Pedido Simple 1: " + pedidoSimple2.calcularTotalPedido());
		
		Pedido pedidoSimple1= new PedidoSimple();
		pedidoSimple1.agregarDetallePedido(new DetallePedido("PR3", 1, 10));
		pedidoSimple1.agregarDetallePedido(new DetallePedido("PR4", 1, 10));
		
		System.out.println("Pedido Simple 2: " + pedidoSimple1.calcularTotalPedido());
		
		Pedido pedidoCompuesto = new PedidoCompuesto();
		pedidoCompuesto.agregarSubPedido(pedidoSimple1);
		pedidoCompuesto.agregarSubPedido(pedidoSimple2);
		
		pedidoCompuesto.agregarDetallePedido(new DetallePedido("PR1",3, 10));
		pedidoCompuesto.agregarDetallePedido(new DetallePedido("PR2",4, 10));
		
		System.out.println("Pedido Compuesto: " + pedidoCompuesto.calcularTotalPedido());
	}

}
