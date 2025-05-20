package POOConHerencia;
import java.util.Arrays;

public class Ejercicio3Alumno extends Ejercicio3Persona{

	//String dni;
	//String nombre;
	//String apellido;
	String fecha_Nac;
	String sexo;
	boolean repetidor;
	Ejercicio3Clases [] unModulo;
	
	public Ejercicio3Alumno(String dni, String nombre, String apellidos, String fecha_Nac, String sexo, boolean repetidor,
			Ejercicio3Clases[] unModulo) {
		super(dni, nombre, apellidos);
		//this.dni = dni;
		//this.nombre = nombre;
		//this.apellidos = apellidos;
		this.fecha_Nac = fecha_Nac;
		this.sexo = sexo;
		this.repetidor = repetidor;
		this.unModulo = unModulo;
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

	public String getApellido() {
		return apellidos;
	}

	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}

	public String getFecha_Nac() {
		return fecha_Nac;
	}

	public void setFecha_Nac(String fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public Ejercicio3Clases[] getUnModulo() {
		return unModulo;
	}

	public void setUnModulo(Ejercicio3Clases[] unModulo) {
		this.unModulo = unModulo;
	}

	@Override
	public String toString() {
		return "Dni: " + dni + ", Nombre: " + nombre + ", Apellidos: "+ apellidos + "Fecha de Nacimiento: " + fecha_Nac + ", Sexo: " + sexo + ", Repetidor: " + repetidor + ", Modumo Matriculado: " + Arrays.toString(unModulo);
	}


	
}
