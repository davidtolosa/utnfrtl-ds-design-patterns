package construccion.singleton.ejemplo2;

public class Singleton {
	
	private  static Singleton instacia = null;

	public Singleton() {
		System.out.println("Se creo un objeto singleton");
	
	}
	
	public static Singleton obterInstacia() {
		if(instacia == null) {
			instacia = new Singleton();
		}
		return instacia;
	}
}
