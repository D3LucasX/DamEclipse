package Biblioteca;

public class Articulo {
	String id;
	String titulo;
	boolean disponible;
	public Articulo(String id, String titulo, boolean disponible) {
		this.id = id;
		this.titulo = titulo;
		this.disponible = disponible;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", disponible=" + disponible + "]";
	}
	
	
}
