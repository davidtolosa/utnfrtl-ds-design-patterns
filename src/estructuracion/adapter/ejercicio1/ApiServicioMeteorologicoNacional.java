package estructuracion.adapter.ejercicio1;

public class ApiServicioMeteorologicoNacional implements ClimaApi {

	@Override
	public Clima obtenerClima(String ciudad) {
		return new Clima(ciudad,20,80,1300);
	}

}
