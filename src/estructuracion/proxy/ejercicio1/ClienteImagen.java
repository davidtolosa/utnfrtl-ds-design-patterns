package estructuracion.proxy.ejercicio1;

public class ClienteImagen {

	public static void main(String[] args) {

		Imagen imagen = new ImagenProxy("img_10.jpg");

		// La imagen se va a cargar del diso
		imagen.mostrarImagen();

		System.out.println();

		// La imagen no se va a cargar del disco
		imagen.mostrarImagen();

	}
}
