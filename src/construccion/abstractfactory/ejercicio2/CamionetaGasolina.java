package construccion.abstractfactory.ejercicio2;

public class CamionetaGasolina extends Camioneta {

	public CamionetaGasolina(String modelo, String color, int capacidadCarga) {
		super(modelo, color, capacidadCarga);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(
				"Camioneta Gasolina de modelo: " + modelo + " de color: " + color + "Capacidad de carga: " + capacidadCarga);


	}

}
