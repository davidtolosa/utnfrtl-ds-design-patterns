package comportamiento.strategy.ejercicio1;

public class CalculoUPS implements CalculoEnvio {

	float costoPorKilo = 2.00f;
	
	@Override
	public float calcular(String origen, String destino, float peso) {
	
		return costoPorKilo * peso; 
	}

}
