package construccion.abstractfactory.ejercicio1;

public class FabricaVehiculoHibrido implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilHibrido(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, String color, int potencia) {
		return new ScooterHibrido(modelo, color, potencia);
	}

}
