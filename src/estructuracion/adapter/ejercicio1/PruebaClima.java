package estructuracion.adapter.ejercicio1;

public class PruebaClima {

	public static void main(String[] args) {
		ClimaApi servicioMeteorologicoNacional = new ApiServicioMeteorologicoNacional();
		
		Clima climaSerMetNac = servicioMeteorologicoNacional.obtenerClima("Trenque Lauquen");
		
		System.out.println(climaSerMetNac);
		System.out.println();
		
		ClimaApi windguru= new ApiWindguruAdapter();
		Clima climaWind = windguru.obtenerClima("Trenque Lauquen");
		System.out.println(climaWind);		
	}

}
