package construccion.builder.ejemplo;

import java.util.Scanner;

import construccion.builder.ejercio1.ConstructorDocumentacionVehiculoDOC;

public class ClienteVehiculo {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		ConstructorDocumentacionVehiculo constructor;
		
		System.out.print("Desea generar documentacion HTML (1) o PDF (2):");
		String seleccion = reader.next();
		
		if(seleccion.equals("1")) {
			constructor = new ConstructorDocumentacionVehiculoHtml();
		}else {
			constructor = new ConstructorDocumentacionVehiculoPdf();
		}	
	
		
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("David");
		documentacion.imprime();
	}

}
