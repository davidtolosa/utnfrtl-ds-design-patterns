package construccion.builder;

public class Vendedor {

	protected ConstructorDocumentacionVehiculo constructor;
	
	public Vendedor(ConstructorDocumentacionVehiculo constructor) {
		this.constructor = constructor;
	}
	
	public Documentacion construye(String nombreCliente) {
		constructor.construyeSolicitudMatriculacion(nombreCliente);
		constructor.construyeSolicitudPedido(nombreCliente);
		
		Documentacion documentacion = constructor.resultado();
		return documentacion;
	}
}
