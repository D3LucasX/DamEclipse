package TallerMecanicoPruebaExamen;

enum TipoSeguro{TERCEROS, TODO_RIESGO}
public class Propietarios {
	String dni;
	String nombre;
	String cuentaBancaria;
	TipoSeguro TipoSeguro;
	public Propietarios(String dni, String nombre, String cuentaBancaria,
			TallerMecanicoPruebaExamen.TipoSeguro tipoSeguro) {
		this.dni = dni;
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		TipoSeguro = tipoSeguro;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public TipoSeguro getTipoSeguro() {
		return TipoSeguro;
	}
	public void setTipoSeguro(TipoSeguro tipoSeguro) {
		TipoSeguro = tipoSeguro;
	}
	
	
}
