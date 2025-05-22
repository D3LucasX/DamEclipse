package Biblioteca;

public class Libro extends Articulo{
	private String autor;

	public Libro(String id, String titulo, boolean disponible, String autor) {
		super(id, titulo, disponible);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", id=" + id + ", titulo=" + titulo + ", disponible=" + disponible + "]";
	}
	
}
