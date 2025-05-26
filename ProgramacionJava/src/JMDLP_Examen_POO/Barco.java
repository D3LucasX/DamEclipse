package JMDLP_Examen_POO;
enum TipoVela{VELA, PESCA, PASAJEROS}
public class Barco extends Vehiculo{
	private int eslora;
	private int calado;
	TipoVela tipoVela;
	public Barco(String marca, String color, String numBastidor, int kilometros, int añoFabricacion, int eslora,
			int calado, TipoVela tipoVela) {
		super(marca, color, numBastidor, kilometros, añoFabricacion);
		this.eslora = eslora;
		this.calado = calado;
		this.tipoVela = tipoVela;
	}
	
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getCalado() {
		return calado;
	}
	public void setCalado(int calado) {
		this.calado = calado;
	}
	public TipoVela getTipoVela() {
		return tipoVela;
	}
	public void setTipoVela(TipoVela tipoVela) {
		this.tipoVela = tipoVela;
	}
	@Override
	public String toString() {
		return "Marca: " + marca + ", color=" + color + ", Numero de bastidor: " + NumBastidor + ", Total de Kilometros: " + Kilometros + ", Año de fabricación: " + añoFabricacion + ", Largo: " + eslora + ", Profundidad: " + calado;
	}
	
}
