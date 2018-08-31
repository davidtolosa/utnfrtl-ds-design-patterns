package construccion.abstractfactory.ejercicio1;
public class AutomovilHibrido extends Automovil {

	public AutomovilHibrido(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automovil Hibrido modelo: " + modelo + " de color: " + color + " de potencia: "
				+ potencia + " de espacio: " + espacio);

	}

}
