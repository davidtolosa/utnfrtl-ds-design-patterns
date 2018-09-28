package construccion.singleton.ejemplo;

public class TestComercial {

	public static void main(String[] args) {
		Comercial elComercial = Comercial.Instance();
		
		elComercial.setNombre("Comercial Auto");
		elComercial.setDireccion("Madrid");
		elComercial.setEmail("comercial@comerciales.com");
		// muestra el comercial del sistema
		visualiza();
		
		Comercial vendedor3 = Comercial.Instance();
		vendedor3.setNombre("David");
		vendedor3.visualiza();
		
		Comercial vendedor4 = Comercial.Instance();
		vendedor4.visualiza();
	}

	public static void visualiza() {
		Comercial elComercial = Comercial.Instance();
		elComercial.visualiza();
	}
}
