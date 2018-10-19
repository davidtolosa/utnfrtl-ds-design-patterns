package comportamiento.strategy.ejercicio1;

public class CalculoFedEx implements CalculoEnvio {
	
	float costoInicial = 5.00f;
	float costoPorKilo = 1.00f;
	float multiplicadorLargaDistancia = 1.33f;
	float costo;

	@Override
	public float calcular(String origen, String destino, float peso) {
		if (origen.equals(destino)) {
			costo = costoInicial + costoPorKilo * peso;
		} else {
			costo = costoInicial + (costoPorKilo * peso) * multiplicadorLargaDistancia;
		}
		return costo;
	}

}
