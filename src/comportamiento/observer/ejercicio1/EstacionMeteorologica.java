package comportamiento.observer.ejercicio1;

import comportamiento.observer.ejercicio1.Sujeto;

public class EstacionMeteorologica extends Sujeto {

	protected double temperatura;
	protected double humedad;
	protected double presion;

	public double getTemperatura() {
		return temperatura;
	}

	public double getHumedad() {
		return humedad;
	}

	public double getPresion() {
		return presion;
	}
	
	public void condicionesActuales(double temperatura, double humedad, double presion) {
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.presion = presion;
		this.notifica();
	}

}
