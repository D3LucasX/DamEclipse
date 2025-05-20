package Colegio;
public class Ejercicio3Directivo extends Ejercicio3Persona{

	//String dni;
	//String nombre;
	//String apellidos;
	//int salario;
	boolean salesiano;
	boolean turno;
	
	public Ejercicio3Directivo(String dni, String nombre, String apellidos, int salario, boolean salesiano, boolean turno) {
		super(dni, nombre, apellidos, salario);
		//this.dni = dni;
		//this.nombre = nombre;
		//this.apellidos = apellidos;
		//this.salario = salario;
		this.salesiano = salesiano;
		this.turno = turno;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public boolean isSalesiano() {
		return salesiano;
	}

	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Dni: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Salario: " + salario + "Salesiano: " + salesiano + ", Turno de mañana: " + turno;
	}

	

}