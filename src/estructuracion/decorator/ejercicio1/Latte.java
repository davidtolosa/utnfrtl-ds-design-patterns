package estructuracion.decorator.ejercicio1;

public class Latte implements Cafe {

	@Override
	public String getDescripcion() {
		return "Latte";
	}

	@Override
	public double costo() {
		return 76;
	}

}
