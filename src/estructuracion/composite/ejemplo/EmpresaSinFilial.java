package estructuracion.composite.ejemplo;

public class EmpresaSinFilial extends Empresa {

	@Override
	public double calcularCostoMantenimiento() {
		return nVehiculos*costoUnitarioVehiculo;
	}

	@Override
	public boolean agregarFilial(Empresa filial) {
		return false;
	}

}
