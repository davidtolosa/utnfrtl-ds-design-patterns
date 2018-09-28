package construccion.singleton.ejemplo2;

public class PruebaSingleton {

	public static void main(String[] args) {

		Singleton singleton = Singleton.obterInstacia();
		
		Singleton singleton2 = Singleton.obterInstacia();
		
		Singleton singleton3 = new Singleton();
	}
}
