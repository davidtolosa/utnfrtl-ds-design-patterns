package estructuracion.proxy.ejercicio1;

public class ImagenProxy implements Imagen {

	private ImagenReal imagenReal;
	private String nombreArchivo;
	
		
	public ImagenProxy(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	@Override
	public void mostrarImagen() {
		if(imagenReal==null) {
			imagenReal = new ImagenReal(nombreArchivo);
		}
		imagenReal.mostrarImagen();
	}

}
