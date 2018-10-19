package estructuracion.facade.ejercicio1;

public class BancoFacadeImplementacion implements BancoFacade {

	private int numeroCuenta;
	private int codigoSeguridad;

	private Cuenta cuenta;
	private Seguridad seguridad;
	private Fondos fondos;

	private MensajeBienvenida mensajeBienvenida;

	public BancoFacadeImplementacion(int numeroCuenta, int codigoSeguridad) {
		this.numeroCuenta = numeroCuenta;
		this.codigoSeguridad = codigoSeguridad;

		mensajeBienvenida = new MensajeBienvenida();
		cuenta = new Cuenta();
		seguridad = new Seguridad();
		fondos = new Fondos();
	}

	@Override
	public void depositarDinero(double monto) {
		if (puedoDepositar(monto)) {
			fondos.depositarDinero(monto);
			System.out.println("Transaccion completa");
		} else {
			System.out.println("Error al realizar la transaccion");
		}

	}

	@Override
	public void retirarDinero(double monto) {
		if (puedoRetirar(monto)) {
			System.out.println("Transaccion completa");
		} else {
			System.out.println("Error al realizar la transaccion");
		}
	}

	private boolean puedoDepositar(double monto) {
		return cuenta.cuentaActiva(numeroCuenta) && seguridad.codigoCheck(codigoSeguridad);
	}

	private boolean puedoRetirar(double monto) {
		return cuenta.cuentaActiva(numeroCuenta) && seguridad.codigoCheck(codigoSeguridad)
				&& fondos.retirarDinero(monto);
	}

}
