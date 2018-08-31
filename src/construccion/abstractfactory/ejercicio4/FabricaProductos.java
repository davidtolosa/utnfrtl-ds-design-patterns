package construccion.abstractfactory.ejercicio4;

public interface FabricaProductos {
	
	CajaDeAhorro crearCajaDeAhorro();
	TarjetaCredito crearTarjetaCredito();
	TarjetaDebito crearTarjetaDebito();
}
