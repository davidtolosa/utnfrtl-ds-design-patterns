package estructuracion.facade.ejercicio1;

public class Fondos {

	private double saldo = 1000.00;
	
	private double obtenerSaldo() {
		return saldo;
	}
	
	public void disminuirSaldoCuenta(double monto){
		saldo = saldo-monto;
	}
	
	public void aumentarSaldoCuenta(double monto){
		saldo = saldo+monto;
	}
	
	public boolean retirarDinero(double monto) {
		if(monto>obtenerSaldo()) {
			System.out.println("No tienes saldo disponible para retirar el monto solicitado");
			System.out.println("Saldo disponible: "+ saldo);
			return false;
		}else {
			disminuirSaldoCuenta(monto);
			System.out.println("Monto retirado: "+monto+" , Saldo disponible: " +saldo);
			return true;
		}
	}
	
	public void depositarDinero(double monto) {
		aumentarSaldoCuenta(monto);
		System.out.println("Saldo disponible: "+ saldo);
	}
}
