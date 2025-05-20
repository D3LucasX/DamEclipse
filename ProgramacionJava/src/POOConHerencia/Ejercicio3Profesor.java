package POOConHerencia;

public class Ejercicio3Profesor extends Ejercicio3Persona{

	int numero_asignatuas;
	boolean tutor;
	
	public Ejercicio3Profesor(String dni, String nombre, String apellidos, int salario, int numero_asignatuas, boolean tutor) {
		super(dni, nombre,apellidos, salario);
		
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
		return "Dni: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Salario: " + salario + "Numero de Asuignaturas que imparte: " + numero_asignatuas + ", Tutor: " + tutor;  
	}

	
}
