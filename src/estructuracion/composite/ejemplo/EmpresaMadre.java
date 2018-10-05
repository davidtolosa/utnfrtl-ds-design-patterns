package estructuracion.composite.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa {

	protected List<Empresa> filiales = new ArrayList<Empresa>();

	@Override
	public double calcularCostoMantenimiento() {
		double costeFiliales = 0;
		
		for(Empresa filial:filiales) {
			costeFiliales = costeFiliales + filial.calcularCostoMantenimiento();
		}

		return costeFiliales+nVehiculos*costoUnitarioVehiculo;
	}

	@Override
	public boolean agregarFilial(Empresa filial) {
		return filiales.add(filial);
	}

}
