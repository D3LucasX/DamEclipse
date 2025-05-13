package POO;

public class aparatosElectricos {
	
	private int consumo;
	private boolean estado;
	private static double consumoTotal = 0; // Ancla propiedad a la clase, para que sea comun para todos los objetos que crees, si no, cada objeto tendría un valor en este campo
									 // y lo creamos para saber el consumo de todos los dispositivos.
									 // STATIC par generar un campo/característica comun para todos los objetos que crees.
	
	public aparatosElectricos(int consumo, boolean estado) {
		
		this.consumo = consumo;
		this.estado= false;
	}
	
	
	public double calcularConsumo() {
		if (estado == true) {
			
		}else if(estado == false){
			this.consumo = 0;
			consumoTotal -= this.consumo;
		}
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		if (estado == true) {
			this.estado = true;
			consumoTotal += consumo;
		}else if (estado == false) {
			this.estado = false;
		}
	}
	
	public static double consumoTotal() {
		return consumoTotal;
	}
	
}
