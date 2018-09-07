package construccion.builder.ejercio2;

public abstract class ConstructorDocumentacionVehiculo {

	protected Documentacion documentacion;
	
	public abstract void construyeSolicitudPedido(String nombreCliente);
	public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);
	public abstract void construyeSolicitudEntrega(String nombreSolicitante);
	public Documentacion resultado() {
		return documentacion;
	}
}
