package estructuracion.adapter.ejercicio2;

public class DocumentoDoc implements Documento {
	
	protected ComponenteDoc herramientaDoc = new ComponenteDoc();

	@Override
	public void setContenido(String contenido) {
		herramientaDoc.escribirContenido(contenido);
	}

	@Override
	public void dibuja() {
		herramientaDoc.darFormatoContenido();
		herramientaDoc.visualiza();
	}

	@Override
	public void imprime() {
		herramientaDoc.imprimirDoc();
	}

}
