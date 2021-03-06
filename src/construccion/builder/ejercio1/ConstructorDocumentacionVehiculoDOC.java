package construccion.builder.ejercio1;

public class ConstructorDocumentacionVehiculoDOC extends ConstructorDocumentacionVehiculo {

	
	
	public ConstructorDocumentacionVehiculoDOC() {
		documentacion= new DocumentacionDOC();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<DOC>Solicitud de pedido Cliente: " +nombreCliente+ "</DOC>";
		documentacion.agregarDocumento(documento);
	
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<DOC>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</DOC>"; 
		documentacion.agregarDocumento(documento);

	}

}
