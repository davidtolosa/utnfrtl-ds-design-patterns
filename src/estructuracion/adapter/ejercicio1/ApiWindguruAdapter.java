package estructuracion.adapter.ejercicio1;

public class ApiWindguruAdapter implements ClimaApi {
	
	private ApiWindguru apiWindguru = new ApiWindguru();

	@Override
	public Clima obtenerClima(String ciudad) {
		
		String ciudadSeleccionada = apiWindguru.seleccionarCiudad(ciudad);
		float temperatura = apiWindguru.obtenerTemperatura();
		float humedad = apiWindguru.obtenerHumedad();
		float presion = apiWindguru.obtenerPresion();
		
		return new Clima(ciudadSeleccionada, temperatura, humedad, presion);
	}

}
