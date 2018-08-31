package construccion.abstractfactory.ejercicio2;

public abstract class Camioneta {

	protected String modelo;
	protected String color;
	protected int capacidadCarga;
	
	public Camioneta(String modelo, String color, int capacidadCarga) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.capacidadCarga = capacidadCarga;
	} 
	
	public abstract void mostrarCaracteristicas();
}
