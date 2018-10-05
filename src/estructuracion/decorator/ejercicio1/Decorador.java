package estructuracion.decorator.ejercicio1;

public abstract class Decorador implements Cafe {

	protected Cafe componente;

	public Decorador(Cafe componente) {
		this.componente = componente;
	}

	@Override
	public String getDescripcion() {
		return componente.getDescripcion();
	}

	@Override
	public double costo() {
		return componente.costo();
	}

}
