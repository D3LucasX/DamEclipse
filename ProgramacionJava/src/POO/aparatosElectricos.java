package POO;

public class aparatosElectricos {
	
	private double consumo;
	private boolean estado;
	private static double consumoTotal = 0; // Ancla propiedad a la clase, para que sea comun para todos los objetos que crees, si no, cada objeto tendría un valor en este campo
									 		// y lo creamos para saber el consumo de todos los dispositivos.
									 		// STATIC par generar un campo/característica comun para todos los objetos que crees.
	
	public aparatosElectricos(int consumo, boolean estado) {
		
		this.consumo = consumo;
		this.estado= false;
	}

	public boolean isEstado() {
		return estado;
	}

	public double setEstado(boolean estado) {
		if(estado == true) {
			this.estado=true;
			consumoTotal += consumo;
			
		}else {
			this.estado = false;
			consumoTotal -= consumo;
			if(consumoTotal < 0) {
				consumoTotal = 0;
			}
		}
		return consumoTotal;
	}
	
	public static double printConsumoTotal() {
		return consumoTotal;
	}
	
}