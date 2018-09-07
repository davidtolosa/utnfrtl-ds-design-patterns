package construccion.builder.ejercio2;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {
	
	 public ConstructorDocumentacionVehiculoPdf() {
		 documentacion = new DocumentacionPdf();
	 }

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
		documentacion.agregarDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud de matriculacion Cliente: " + nombreSolicitante + "</PDF>";
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudEntrega(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud de entrega Cliente: " + nombreSolicitante + "</PDF>";
		documentacion.agregarDocumento(documento);
		
	}

}
