package TallerMecanicoPruebaExamen;
public class Vehiculos {
	String idRegistro;
	String Marca;
	String Modelo;
	String color;
	int año;
	int precioSalida;
	double velocidadMaxima;
	
	public Vehiculos() {}

	public Vehiculos(String idRegistro, String marca, String modelo, String color, int año, int precioSalida,
			double velocidadMaxima) {
		super();
		this.idRegistro = idRegistro;
		Marca = marca;
		Modelo = modelo;
		this.color = color;
		this.año = año;
		this.precioSalida = precioSalida;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getPrecioSalida() {
		return precioSalida;
	}

	public void setPrecioSalida(int precioSalida) {
		this.precioSalida = precioSalida;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean esCoche(String esCoche) {
		if(esCoche.toLowerCase().equals("si")) {
			return true;
		}
		else return false;
	}

	
	
	
	
}
