package construccion.abstractfactory.ejercicio2;

public interface FabricaVehiculo {
	
	Automovil crearAutomovil(String modelo,String color,int potencia,double espacio);
	Scooter crearScooter(String modelo,String color,int potencia);
	Camioneta crearCamioneta(String modelo, String color, int capacidadCarga);
}
