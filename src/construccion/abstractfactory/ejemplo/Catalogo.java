package construccion.abstractfactory.ejemplo;

import java.util.Scanner;

public class Catalogo {

	public static int nAutos = 3;
	public static int nScooters = 2;

	public static void main(String[] args) {

		// Para leer lo que el usuario me ingresa por teclado
		Scanner reader = new Scanner(System.in);

		// Defino una fabrica de vehiculo que va a instanciar con la seleccion del
		// usuario
		FabricaVehiculo fabrica;

		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooters];

		// Le pido al usuario que seleccione el tipo de vehiculos a usar
		System.out.print("Desea utilizar vehiculos electricos (1) o a gasolina (2):");
		String eleccion = reader.next();

		//Segun la eleccion creo la fabrica correspondiente
		if (eleccion.equals("1")) {
			fabrica = new FabricaVehiculoElectricidad();
		} else {
			fabrica = new FabricaVehiculoGasolina();
		}
		
		//Creo algunos automoviles y scooters 
		for (int index = 0; index < nAutos; index++)
			autos[index] = fabrica.crearAutomovil("estandar","amarillo", 6+index, 3.2);
			
		for (int index = 0; index < nScooters; index++)
			scooters[index] = fabrica.crearScooter("clasico","rojo", 2+index);
			
		//Muestro los Automoviles y Scooters creados
		for (Automovil auto: autos)
			auto.mostrarCaracteristicas();
			
		for (Scooter scooter: scooters)
			scooter.mostrarCaracteristicas();
	}

}
