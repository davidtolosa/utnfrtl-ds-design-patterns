package comportamiento.strategy.ejercicio1;

public class CalculadorEnvio {

	public static void main(String[] args) {
		// Un cliente envía un paquete con 8.7 kilos de peso de
		// Buenos Aires a Buenos Aires, y quiere saber su costo con cada
		// método de envío
		Envio envioEstandar = new Envio("BA", "BA", 8.7f,new CalculoEstandar());
		System.out.println("Envio estandar: "+ envioEstandar.obtenerPrecio());
		
		Envio envioFedEx = new Envio("BA", "BA", 8.7f,new CalculoFedEx());
		System.out.println("Envio FedEx: "+ envioFedEx.obtenerPrecio());
	}

}
