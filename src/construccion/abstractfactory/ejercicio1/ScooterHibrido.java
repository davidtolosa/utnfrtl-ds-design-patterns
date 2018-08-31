package construccion.abstractfactory.ejercicio1;

public class ScooterHibrido extends Scooter {

	public ScooterHibrido(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter Hibrido modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);

	}

}
