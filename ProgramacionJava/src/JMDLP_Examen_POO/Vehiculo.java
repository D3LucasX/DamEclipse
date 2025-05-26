package JMDLP_Examen_POO;

public class Vehiculo {
	public String marca;
	public String color;
	public String NumBastidor;
	public int Kilometros;
	protected int añoFabricacion;
	public Vehiculo(String marca, String color, String numBastidor, int kilometros, int añoFabricacion) {
		super();
		this.marca = marca;
		this.color = color;
		NumBastidor = numBastidor;
		Kilometros = kilometros;
		this.añoFabricacion = añoFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumBastidor() {
		return NumBastidor;
	}
	public void setNumBastidor(String numBastidor) {
		NumBastidor = numBastidor;
	}
	public int getKilometros() {
		return Kilometros;
	}
	public void setKilometros(int kilometros) {
		Kilometros = kilometros;
	}
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	@Override
	public String toString() {
		return "marca: " + marca + ", color: " + color + ", Numero de Bastidor: " + NumBastidor + ", Cantidad total de Kilómetros: "
				+ Kilometros + ", Año de fabricación: " + añoFabricacion;
	}
	
}
