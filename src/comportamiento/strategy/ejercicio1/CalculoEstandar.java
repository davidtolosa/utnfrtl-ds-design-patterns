package comportamiento.strategy.ejercicio1;

public class CalculoEstandar implements CalculoEnvio {

	float precioLocalPorKilo = 0.089f;
	float precioLargaDistanciaPorKilo = 0.123f;
	float precioTotal = 0;

	@Override
	public float calcular(String origen, String destino, float peso) {

		if (destino.equals(origen)) {
			precioTotal = precioLocalPorKilo;
		} else {
			precioTotal = precioLargaDistanciaPorKilo;
		}
		return peso * precioTotal;
	}

}
