package POOConHerencia;

public class Ejercicio3Persona {
	String dni;
	String nombre;
	String apellidos;
	int salario;
	public Ejercicio3Persona(String dni, String nombre, String apellidos, int salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	public Ejercicio3Persona(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = 0;
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
	@Override
	public String toString() {
		return "Ejercicio3Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
				+ salario + "]";
	}

	
}


