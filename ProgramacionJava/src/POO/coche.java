package POO;
enum TipoCoche {MINI, DEPORTIVO, UTILITARIO, FAMILIAR}
enum TipoSeguro{TERCEROS, TODO_RIESGO}
public class coche {
	public String modelo;
	public String color;
	public boolean metalizado;
	public String matricula;
	public int anoFabricacion;
	TipoCoche TipoCoche;
	TipoSeguro TipoSeguro;
	
	
	public coche(String modelo, String color, boolean metalizado, String matricula, int anoFabricacion,
			POO.TipoCoche tipoCoche, POO.TipoSeguro tipoSeguro) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.metalizado = metalizado;
		this.matricula = matricula;
		this.anoFabricacion = anoFabricacion;
		TipoCoche = tipoCoche;
		TipoSeguro = tipoSeguro;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isMetalizado() {
		return metalizado;
	}
	public void setMetalizado(boolean metalizado) {
		this.metalizado = metalizado;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}


	@Override
	public String toString() {
		return "coche [modelo=" + modelo + ", color=" + color + ", metalizado=" + metalizado + ", matricula="
				+ matricula + ", anoFabricacion=" + anoFabricacion + "]";
	}
	
	
	
	
	
}


