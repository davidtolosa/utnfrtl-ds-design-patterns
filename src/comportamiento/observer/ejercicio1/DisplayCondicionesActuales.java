package comportamiento.observer.ejercicio1;

public class DisplayCondicionesActuales implements Observador {

	protected double temperatura;
	protected double humedad;
	protected double presion;

	protected EstacionMeteorologica estacionMeteorologica;

	public DisplayCondicionesActuales(EstacionMeteorologica estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
		this.estacionMeteorologica.agrega(this);
	}

	@Override
	public void actualiza() {
		this.temperatura = estacionMeteorologica.getTemperatura();
		this.humedad = estacionMeteorologica.getHumedad();
		this.presion = estacionMeteorologica.getPresion();
		this.display();
	}

	public void display() {
		System.out.println("Condiciones actuales: " + this.temperatura + "ºC y  " + this.humedad + "% Humedad");
	}

}
