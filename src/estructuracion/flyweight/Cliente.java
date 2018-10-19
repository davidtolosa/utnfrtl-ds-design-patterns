package estructuracion.flyweight;

public class Cliente {

	public static void main(String[] args) {
		FabricaOpcion fabrica = new FabricaOpcion();
		VehiculoSolicitado vehiculo = new VehiculoSolicitado();
		vehiculo.agregaOpciones("air bag", 80, fabrica);
		vehiculo.agregaOpciones("dirección asistida", 90, fabrica);
		vehiculo.agregaOpciones("elevalunas eléctricos", 85, fabrica);
		vehiculo.muestraOpciones();
		
		VehiculoSolicitado vehiculo2 = new VehiculoSolicitado();
		vehiculo2.agregaOpciones("air bag", 80, fabrica);
		vehiculo2.agregaOpciones("dirección asistida", 95, fabrica);
		vehiculo2.agregaOpciones("elevalunas eléctricos", 85, fabrica);
		vehiculo2.agregaOpciones("climatizador", 100, fabrica);
		vehiculo2.muestraOpciones();
	}

}
