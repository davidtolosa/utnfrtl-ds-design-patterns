package estructuracion.facade.ejercicio1;

public class Cuenta {

	private int numeroCuenta = 1234567890;
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public boolean cuentaActiva(int numeroCuentaToCheck) {
		if(numeroCuentaToCheck==getNumeroCuenta()) {
			return true;
		}else {
			return false;
		}
	}
}
