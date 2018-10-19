package comportamiento.observer.ejercicio1;

public class EstacionDelTiempo {

	public static void main(String[] args) {

		EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();
		
		DisplayCondicionesActuales displayCondicionesActuales = new DisplayCondicionesActuales(estacionMeteorologica);
		DisplayTemperaturaHistorica dsDisplayTemperaturaHistorica = new DisplayTemperaturaHistorica(estacionMeteorologica);
		
		estacionMeteorologica.condicionesActuales(20, 30, 1300);
		estacionMeteorologica.condicionesActuales(29, 30, 1300);
		
	}

}
