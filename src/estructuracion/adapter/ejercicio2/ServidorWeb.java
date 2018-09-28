package estructuracion.adapter.ejercicio2;

public class ServidorWeb {
	
	public static void main(String[] args) {
		Documento documento1;
		Documento documento2;
		Documento documento3;
		
		documento1 = new DocumentoHtml();
		documento1.setContenido("Hello");
		documento1.dibuja();
		
		System.out.println(); //Salto de linea
		
		documento2 = new DocumentoPdf();
		documento2.setContenido("Hola");
		documento2.dibuja();
	
		System.out.println(); //Salto de linea
		
		documento3 = new DocumentoDoc();
		documento3.setContenido("Hola soy un Doc");
		documento3.dibuja();
	}

}
