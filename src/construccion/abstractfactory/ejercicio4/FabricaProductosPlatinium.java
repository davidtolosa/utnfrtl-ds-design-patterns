package construccion.abstractfactory.ejercicio4;

public class FabricaProductosPlatinium implements FabricaProductos {

	@Override
	public CajaDeAhorro crearCajaDeAhorro() {
		return new CajaDeAhorroPlatinium();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		return new TarjetaCreditoPlatinium();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		return new TarjetaDebitoPlatinium();
	}

}
