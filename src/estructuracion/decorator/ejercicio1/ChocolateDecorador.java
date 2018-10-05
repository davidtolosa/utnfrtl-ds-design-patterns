package estructuracion.decorator.ejercicio1;

public class ChocolateDecorador extends Decorador {

	public ChocolateDecorador(Cafe componente) {
		super(componente);
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion() + ", con Chocolate";
	}

	@Override
	public double costo() {
		return super.costo() + 17;
	}

	
}
