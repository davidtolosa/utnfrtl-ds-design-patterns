package construccion.prototype.ejercicio2;

public class Usuario {

	public static void main(String[] args) {

		// inicializacion de la documentacion en blanco
		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
		documentacionEnBlanco.incluye(new OrdenDePedido());
		documentacionEnBlanco.incluye(new CertificadoCesion());
		documentacionEnBlanco.incluye(new SolicitudMatriculacion());
		documentacionEnBlanco.incluye(new OrdenDeEntrega());
		// creacion de documentacion nueva para dos clientes
		DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
		DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
		DocumentacionCliente documentacionCliente3 = new DocumentacionCliente("David");
		documentacionCliente1.visualiza();
		documentacionCliente2.visualiza();
		documentacionCliente3.imprime();

	}

}
