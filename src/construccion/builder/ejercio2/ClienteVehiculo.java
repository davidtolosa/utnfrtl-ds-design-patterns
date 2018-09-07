package construccion.builder.ejercio2;

import java.util.Scanner;

import construccion.builder.ejercio2.ConstructorDocumentacionVehiculoHtml;
import construccion.builder.ejercio2.ConstructorDocumentacionVehiculoPdf;

public class ClienteVehiculo {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		ConstructorDocumentacionVehiculo constructor = null;
		
		System.out.print("Desea generar documentacion HTML (1), PDF (2), DOC(3):");
		String seleccion = reader.next();
		
		switch (seleccion) {
		case "1":
			constructor = new ConstructorDocumentacionVehiculoHtml();
			break;
		case "2":
			constructor = new ConstructorDocumentacionVehiculoPdf();
			break;
		case "3":
			constructor = new ConstructorDocumentacionVehiculoDOC();
			break;
		default:
			break;
		}
		
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("David");
		documentacion.imprime();
	}

}
