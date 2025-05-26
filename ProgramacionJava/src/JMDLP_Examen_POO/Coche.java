package JMDLP_Examen_POO;

public class Coche extends Vehiculo{
	protected boolean electrico;
	private boolean antiguo;
	public Coche(String marca, String color, String numBastidor, int kilometros, int añoFabricacion, boolean electrico,
			boolean antiguo) {
		super(marca, color, numBastidor, kilometros, añoFabricacion);
		this.electrico = electrico;
		this.antiguo = antiguo;
	}
	public Coche(String marca, String color, String numBastidor, int kilometros, int añoFabricacion,
			boolean electrico) {
		super(marca, color, numBastidor, kilometros, añoFabricacion);
		this.electrico = electrico;
	}
	
	public Coche(String marca, String color, String numBastidor, int kilometros, int añoFabricacion) {
		super(marca, color, numBastidor, kilometros, añoFabricacion);
	}
	public boolean isElectrico() {
		return electrico;
	}
	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	public boolean isAntiguo() {
		return antiguo;
	}
	public void setAntiguo(boolean antiguo) {
		this.antiguo = antiguo;
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + ", color=" + color + ", Numero de bastidor: " + NumBastidor + ", Total de Kilometros: " + Kilometros + ", Año de fabricación: " + añoFabricacion + ", Es electrico: (true es si, false es no) " + electrico + ", Es antiguo: " + antiguo;
	}
	public String toString1() {
		return "Marca: " + marca + ", color=" + color + ", Numero de bastidor: " + NumBastidor + ", Total de Kilometros: " + Kilometros + ", Año de fabricación: " + añoFabricacion + ", Es electrico: " + electrico;
	}
}
