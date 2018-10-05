package estructuracion.composite.ejemplo;

public abstract class Empresa {
	
	protected static double costoUnitarioVehiculo = 5.0;
	protected int nVehiculos;
	
	public void agregarVehiculo() {
		nVehiculos = nVehiculos+1;
	}
	
	public abstract double calcularCostoMantenimiento();
	public abstract boolean agregarFilial(Empresa filial);
}
