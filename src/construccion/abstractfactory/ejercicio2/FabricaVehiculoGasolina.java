package construccion.abstractfactory.ejercicio2;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilGasolina(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, String color, int potencia) {
		return new ScooterGasolina(modelo, color, potencia);
	}

	@Override
	public Camioneta crearCamioneta(String modelo, String color, int capacidadCarga) {
		return new CamionetaGasolina(modelo, color, capacidadCarga);
	}

}
