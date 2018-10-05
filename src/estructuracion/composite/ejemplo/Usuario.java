package estructuracion.composite.ejemplo;

public class Usuario {

	public static void main(String[] args) {
		Empresa empresa1 = new EmpresaSinFilial();
		empresa1.agregarVehiculo();
		
		System.out.println("Costo de mantenimiento empresa1: " + empresa1.calcularCostoMantenimiento());

		Empresa empresa2 = new EmpresaSinFilial();
		empresa2.agregarVehiculo();
		empresa2.agregarVehiculo();

		Empresa grupo = new EmpresaMadre();
		grupo.agregarFilial(empresa1);
		grupo.agregarFilial(empresa2);
		grupo.agregarVehiculo();

		System.out.println("Costo de mantenimiento total del grupo: " + grupo.calcularCostoMantenimiento());
	}
}
