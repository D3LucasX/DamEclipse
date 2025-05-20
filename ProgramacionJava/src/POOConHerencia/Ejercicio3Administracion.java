package POOConHerencia;
public class Ejercicio3Administracion extends Ejercicio3Persona{
	
	//String dni;
	//String nombre;
	//String apellidos;
	int salario;
	String estudios;
	int antiguedad;
	
	public Ejercicio3Administracion(String dni, String nombre, String apellidos, int salario, String estudios, int antiguedad) {
		super(dni, nombre, apellidos, salario);
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.estudios = estudios;
		this.antiguedad = antiguedad;
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

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Dni: " + dni + ", nombre: " + nombre + ", apellidos: " + apellidos + "salario: " + salario + ", estudios: " + estudios + ", antiguedad: " + antiguedad;
	}

	

}
