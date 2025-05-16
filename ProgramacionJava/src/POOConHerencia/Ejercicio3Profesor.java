package POOConHerencia;

public class Ejercicio3Profesor extends Ejercicio3Persona{

	//String dni;
	//String nombre;
	//String apellidos;
	//int salario;
	int numero_asignatuas;
	boolean tutor;
	
	public Ejercicio3Profesor(String dni, String nombre, String apellidos, int salario, int numero_asignatuas, boolean tutor) {
		super(dni, nombre,apellidos, salario);
		//this.dni = dni;
		//this.nombre = nombre;
		//this.apellidos = apellidos;
		//this.salario = salario;
		this.numero_asignatuas = numero_asignatuas;
		this.tutor = tutor;
	}

	public int getNumero_asignatuas() {
		return numero_asignatuas;
	}

	public void setNumero_asignatuas(int numero_asignatuas) {
		this.numero_asignatuas = numero_asignatuas;
	}

	public boolean isTutor() {
		return tutor;
	}

	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	@Override
	public String toString() {
		return "Ejercicio3Profesor [numero_asignatuas=" + numero_asignatuas + ", tutor=" + tutor + ", dni=" + dni
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";  //Aqui lueg se comentaría como quisieramos, y cambiariamos el orden de los datos que salen
	}

	
}
