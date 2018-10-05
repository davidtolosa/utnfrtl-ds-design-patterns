package estructuracion.decorator.ejercicio1;

public class Descafeinado implements Cafe {

	@Override
	public String getDescripcion() {
		return "Decafeinado";
	}

	@Override
	public double costo() {
		return 50;
	}

}
