	package estructuracion.decorator.ejemplo;
	
	public class MarcaDecorador extends Decorador {
	
		public MarcaDecorador(ComponenteGraficoVehiculo componente) {
			super(componente);
		}
	
		protected void visualizaLogo() {
			System.out.println("Logotipo de la marca");
		}
	
		@Override
		public void visualiza() {
			super.visualiza();
			visualizaLogo();
		}
	
	}
