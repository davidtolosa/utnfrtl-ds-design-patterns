package construccion.abstractfactory.ejercicio3;

public class FabricaProductosClassic implements FabricaProductos {

	@Override
	public CajaDeAhorro crearCajaDeAhorro() {
		return new CajaDeAhorroClassic();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		return new TarjetaCreditoClassic();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		return new TarjetaDebitoClassic();
	}

}
