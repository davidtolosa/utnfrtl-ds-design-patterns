package comportamiento.observer.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class DisplayTemperaturaHistorica implements Observador {

	protected List<Double> temperaturas = new ArrayList<Double>();
	protected EstacionMeteorologica estacionMeteorologica;

	public DisplayTemperaturaHistorica(EstacionMeteorologica estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
		this.estacionMeteorologica.agrega(this);
	}

	@Override
	public void actualiza() {
		this.temperaturas.add(estacionMeteorologica.getTemperatura());
		this.display();
		
	}
	
	public void display() {
		System.out.println("Historial de temperaturas:");
		for (Double temperatura:temperaturas){
			System.out.println(" --"+temperatura+ " ºC");
		}
	}

}
