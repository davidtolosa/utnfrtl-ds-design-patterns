package construccion.singleton.ejercicio1;

public class Logger {
	
	private static Logger instacia = null;
	
	private Logger() {
		System.out.println("Se creo un objeto Logger");
	}

	private boolean abrirArchivoLog() {
		System.out.println("Archivo Log Abierto");
		return true;
	}
	
	private boolean cerrarArchivoLog() {
		System.out.println("Archivo Log Cerrado");
		return true;
	}
	
	public void log(String log) {
		if(this.abrirArchivoLog()) {
			System.out.println("Guardado en log: " + log);
		}
		this.cerrarArchivoLog();
	}
	
	public static Logger intancia() {
		if(instacia == null) {
			instacia = new Logger();
		}
		return instacia;
	}
}
