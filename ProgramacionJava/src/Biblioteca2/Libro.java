package Biblioteca2;

public class Libro extends Articulos {
	String autor;

	public Libro(int id, String titulo, boolean disponivilidad, String autor) {
		super(id, titulo, disponivilidad);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
