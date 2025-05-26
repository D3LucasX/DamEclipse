package JMDLP_Examen_POO;

public class Avion extends Vehiculo{
	private byte motores;
	private double velocidadMaxima;
	private boolean combate;
	public Avion(String marca, String color, String numBastidor, int kilometros, int añoFabricacion, byte motores,
			double velocidadMaxima, boolean combate) {
		super(marca, color, numBastidor, kilometros, añoFabricacion);
		this.motores = motores;
		this.velocidadMaxima = velocidadMaxima;
		this.combate = combate;
	}
	public Avion(String marca, String color, String numBastidor, int kilometros, int añoFabricacion, boolean combate) {
		super(marca, color, numBastidor, kilometros, añoFabricacion);
		this.combate = combate;
	}
	
	
	public byte getMotores() {
		return motores;
	}
	public void setMotores(byte motores) {
		this.motores = motores;
	}
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public boolean isCombate() {
		return combate;
	}
	public void setCombate(boolean combate) {
		this.combate = combate;
	}
	@Override
	public String toString() {
		return "Marca: " + marca + ", color=" + color + ", Numero de bastidor: " + NumBastidor + ", Total de Kilometros: " + Kilometros + ", Año de fabricación: " + añoFabricacion + ", Numero de motores: " + motores + ", Velocidad Máxima: " + velocidadMaxima + ", Es de combate: (true es si, false es no) " + combate;
	}
	
	public String toString1() {
		return "Marca: " + marca + ", color=" + color + ", Numero de bastidor: " + NumBastidor + ", Total de Kilometros: " + Kilometros + ", Año de fabricación: " + añoFabricacion + ", Numero de motores: " + motores + ", Velocidad Máxima: " + velocidadMaxima;
	}
}
