package construccion.abstractfactory.ejercicio4;

public class FabricaProductosGold implements FabricaProductos {

	@Override
	public CajaDeAhorro crearCajaDeAhorro() {
		return new CajaDeAhorroGold();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		return new TarjetaCreditoGold();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		return new TarjetaDebitoGold();
	}

}
