package comportamiento.strategy.ejercicio1;

public class Envio {

	private String origen;
	private String destino;
	private float peso;

	CalculoEnvio calculo;

	public Envio(String origen, String destino, float peso, CalculoEnvio calculo) {
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
		this.calculo = calculo;
	}
	
	public float obtenerPrecio() {
		return this.calculo.calcular(origen, destino, peso);
	}

}
