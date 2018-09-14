package construccion.prototype.ejercicio2;

public class OrdenDeEntrega extends Documento {

	@Override
	public void imprime() {
		System.out.println("Imprime la orden de entrega: " + contenido);
	}

	@Override
	public void visualiza() {
		System.out.println("Muestra la orden de entrega: " + contenido);
	}

	
}
