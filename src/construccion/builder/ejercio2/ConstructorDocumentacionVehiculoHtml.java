package construccion.builder.ejercio2;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {
	
	 public ConstructorDocumentacionVehiculoHtml() {
		documentacion = new DocumentacionHtml();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<HTML>Solicitud de pedido Cliente: " +nombreCliente+ "</HTML>";
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>"; 
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudEntrega(String nombreSolicitante) {
		String documento;
		documento = "<HTML>Solicitud de Entrega, Solicitante: " + nombreSolicitante + "</HTML>"; 
		documentacion.agregarDocumento(documento);
			
	}

}
