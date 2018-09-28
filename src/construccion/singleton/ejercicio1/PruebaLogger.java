package construccion.singleton.ejercicio1;

public class PruebaLogger {

	public static void main(String[] args) {
	
		Logger l1 = Logger.intancia();		
		l1.log("Logger1");

		System.out.println();
		Logger l2 = Logger.intancia();		
		l2.log("Logger2");
	}

}
