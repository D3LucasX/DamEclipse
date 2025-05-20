package POOConHerencia;

import POO.Ejercicio3Profesor;

public class Ejercicio3Clases {
	String nombre;
	int horas;
	Ejercicio3Profesor unProfesor;
	boolean convalidable;
	
	public Ejercicio3Clases(String nombre, int horas, Ejercicio3Profesor unProfesor, boolean convalidable) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.unProfesor = unProfesor;
		this.convalidable = convalidable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Ejercicio3Profesor getUnProfesor() {
		return unProfesor;
	}

	public void setUnProfesor(Ejercicio3Profesor unProfesor) {
		this.unProfesor = unProfesor;
	}

	public boolean isConvalidable() {
		return convalidable;
	}

	public void setConvalidable(boolean convalidable) {
		this.convalidable = convalidable;
	}

	@Override
	public String toString() {
		return "Nombre del Módulo: " + nombre + ", Horas Lectivas: " + horas + ", Profesor: " + unProfesor + ", Convidable: " + convalidable;
	}
	
}
