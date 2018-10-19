package comportamiento.strategy.ejercicio1problema;

public class CalculadorEnvio {

	public static void main(String[] args) {
		// Un cliente envía un paquete con 8.7 kilos de peso de
		// Buenos Aires a Buenos Aires, y quiere saber su costo con cada
		// método de envío
		Envio envio = new Envio("BA", "BA", 8.7f);
		System.out.println("Coste con envío estandar:" + envio.getPrecio(1));
		System.out.println("Coste con envío FedEx :" + envio.getPrecio(2));
		System.out.println("Coste con envío UPS : " + envio.getPrecio(3));

	}

}
