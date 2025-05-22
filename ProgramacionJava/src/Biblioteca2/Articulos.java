package Biblioteca2;

public class Articulos {
	int id;
	String titulo;
	boolean disponivilidad;
	public Articulos(int id, String titulo, boolean disponivilidad) {
		this.id = id;
		this.titulo = titulo;
		this.disponivilidad = disponivilidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivilidad() {
		return disponivilidad;
	}
	public void setDisponivilidad(boolean disponivilidad) {
		this.disponivilidad = disponivilidad;
	}
	
}
