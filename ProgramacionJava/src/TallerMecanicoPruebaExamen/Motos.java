package TallerMecanicoPruebaExamen;

public class Motos extends Vehiculos {
	int cilindrada;
	boolean tieneSidecar;
	boolean esDeportiva;
	
	public Motos(String idRegistro, String marca, String modelo, String color, int año, int precioSalida,
			double velocidadMaxima, int cilindrada, boolean tieneSidecar, boolean esDeportiva) {
		super(idRegistro, marca, modelo, color, año, precioSalida, velocidadMaxima);
		this.cilindrada = cilindrada;
		this.tieneSidecar = tieneSidecar;
		this.esDeportiva = esDeportiva;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public boolean isTieneSidecar() {
		return tieneSidecar;
	}
	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	public boolean isEsDeportiva() {
		return esDeportiva;
	}
	public void setEsDeportiva(boolean esDeportiva) {
		this.esDeportiva = esDeportiva;
	}
	@Override
	public String toString() {
		return "Motos [cilindrada=" + cilindrada + ", tieneSidecar=" + tieneSidecar + ", esDeportiva=" + esDeportiva
				+ ", idRegistro=" + idRegistro + ", Marca=" + Marca + ", Modelo=" + Modelo + ", color=" + color
				+ ", año=" + año + ", precioSalida=" + precioSalida + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	

}
