package construccion.abstractfactory.ejercicio4;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {

		// Para leer lo que el usuario me ingresa por teclado
		Scanner reader = new Scanner(System.in);

		// Defino una fabrica de productos que se va a instanciar con la seleccion del
		// usuario
		FabricaProductos fabrica = null;
		CajaDeAhorro cajaDeAhorro = null;
		TarjetaCredito tarjetaCredito = null; 
		TarjetaDebito tarjetaDebito = null;

		// Le pido al usuario que seleccione el tipo de Cuenta va a utilizar
		System.out.print("Que tipo de cuenta quiere utilizar: Classic (1), Platinium (2), Gold(3), Estudiante(4):");
		String eleccion = reader.next();

		// Segun la eleccion creo la fabrica correspondiente
		switch (eleccion) {
		case "1":
			fabrica = new FabricaProductosClassic();
			break;
		case "2":
			fabrica = new FabricaProductosPlatinium();
			break;
		case "3":
			fabrica = new FabricaProductosGold();
			break;
		case "4":
			fabrica = new FabricaProductosEstudiante();
			break;
		default:
			break;
		}
				
		cajaDeAhorro = fabrica.crearCajaDeAhorro();
		tarjetaDebito = fabrica.crearTarjetaDebito();
		tarjetaCredito= fabrica.crearTarjetaCredito();
		
		System.out.println(cajaDeAhorro.mostrarCaracteristicas());
		System.out.println(tarjetaDebito.mostrarCaracteristicas());
		System.out.println(tarjetaCredito.mostrarCaracteristicas());
	}

}
