package comportamiento.observer.ejemplo;

public class VistaVehiculo implements Observador {

	protected Vehiculo vehiculo;
	protected String texto = "";

	public VistaVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
		actualizaTexto();
	}

	protected void actualizaTexto() {
		texto = "Descripcion " + vehiculo.getDescripcion() + " Precio: " + vehiculo.getPrecio();
	}

	public void actualiza() {
		actualizaTexto();
		this.redibuja();
	}

	public void redibuja() {
		System.out.println(texto);
	}

}
