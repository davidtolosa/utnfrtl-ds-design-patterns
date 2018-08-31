package construccion.abstractfactory.ejercicio3;

public interface FabricaProductos {
	
	CajaDeAhorro crearCajaDeAhorro();
	TarjetaCredito crearTarjetaCredito();
	TarjetaDebito crearTarjetaDebito();
}
