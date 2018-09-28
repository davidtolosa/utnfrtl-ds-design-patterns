package estructuracion.adapter.ejercicio2;

public class ComponenteDoc {

	protected String contenido; 
	
	public void escribirContenido(String contenido) {
		this.contenido=contenido;
	}
	
	public void darFormatoContenido() {
		contenido = "Documento Doc: " + contenido;
	}
	
	public void visualiza() {
		System.out.println("Visuliza: " + contenido);
	}
	
	public void imprimirDoc() {
		System.out.println("Imprime: " + contenido);
	}
}
