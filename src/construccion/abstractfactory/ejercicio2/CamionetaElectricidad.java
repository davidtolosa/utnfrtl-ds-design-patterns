package construccion.abstractfactory.ejercicio2;

public class CamionetaElectricidad extends Camioneta {

	public CamionetaElectricidad(String modelo, String color, int capacidadCarga) {
		super(modelo, color, capacidadCarga);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(
				"Camioneta electrica de modelo: " + modelo + " de color: " + color + "Capacidad de carga: " + capacidadCarga);
	}

}
