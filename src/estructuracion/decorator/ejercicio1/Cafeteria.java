package estructuracion.decorator.ejercicio1;

public class Cafeteria {

	public static void main(String[] args) {

		Cafe cafe1 = new Capuchino();
		cafe1 = new CremaDecorador(cafe1);
		cafe1 = new CanelaDecorador(cafe1);
		cafe1 = new ChocolateDecorador(cafe1);
		System.out.println(cafe1.getDescripcion() + " -Costo: " + cafe1.costo());
	}

}
