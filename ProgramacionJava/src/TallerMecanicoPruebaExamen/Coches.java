package TallerMecanicoPruebaExamen;

enum TipoCombustible{DIESEL, GASOLINA}
public class Coches extends Vehiculos {
	int numeroPuertas;
	TipoCombustible tipoCombustible;
	boolean tieneAirBag;
	boolean esAutomático;
	public Coches(String idRegistro, String marca, String modelo, String color, int año, int precioSalida,
			double velocidadMaxima, int numeroPuertas, TipoCombustible tipoCombustible, boolean tieneAirBag,
			boolean esAutomático) {
		super(idRegistro, marca, modelo, color, año, precioSalida, velocidadMaxima);
		this.numeroPuertas = numeroPuertas;
		this.tipoCombustible = tipoCombustible;
		this.tieneAirBag = tieneAirBag;
		this.esAutomático = esAutomático;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public boolean isTieneAirBag() {
		return tieneAirBag;
	}
	public void setTieneAirBag(boolean tieneAirBag) {
		this.tieneAirBag = tieneAirBag;
	}
	public boolean isEsAutomático() {
		return esAutomático;
	}
	public void setEsAutomático(boolean esAutomático) {
		this.esAutomático = esAutomático;
	}
	@Override
	public String toString() {
		return "Coches [numeroPuertas=" + numeroPuertas + ", tipoCombustible=" + tipoCombustible + ", tieneAirBag="
				+ tieneAirBag + ", esAutomático=" + esAutomático + ", idRegistro=" + idRegistro + ", Marca=" + Marca
				+ ", Modelo=" + Modelo + ", color=" + color + ", año=" + año + ", precioSalida=" + precioSalida
				+ ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	

	
	
}
