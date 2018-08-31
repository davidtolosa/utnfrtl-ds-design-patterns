package construccion.abstractfactory.ejercicio4;

import construccion.abstractfactory.ejercicio4.CajaDeAhorro;
import construccion.abstractfactory.ejercicio4.FabricaProductos;
import construccion.abstractfactory.ejercicio4.TarjetaCredito;
import construccion.abstractfactory.ejercicio4.TarjetaDebito;

public class FabricaProductosEstudiante implements FabricaProductos {

	@Override
	public CajaDeAhorro crearCajaDeAhorro() {
		// TODO -generated method stub
		return new CajaAhorroEstudiante();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		// TODO Auto-generated method stub
		return new TarjetaCreditoEstudiante();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		// TODO Auto-generated method stub
		return new TarjetaDebitoEstudiante();
	}

}
