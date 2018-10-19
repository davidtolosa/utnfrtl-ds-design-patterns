package estructuracion.proxy.ejercicio1;

public class ImagenReal implements Imagen {

	private String nombreArchivo;
	
	public ImagenReal(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
		cargarDelDisco(nombreArchivo);
	}

	@Override
	public void mostrarImagen() {
		System.out.println("Mostrando imagen " + nombreArchivo);
	}

	public void cargarDelDisco(String nombreArchivo){
		System.out.println("Cargando imagen del disco " + nombreArchivo);
	}
}
