package Biblioteca;

public class Biblioteca {
	String nombre;
	Revista [] unaRevista;
	Libro [] unLibro;
	public Biblioteca(String nombre, Revista[] unaRevista, Libro[] unLibro) {
		super();
		this.nombre = nombre;
		this.unaRevista = unaRevista;
		this.unLibro = unLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Revista[] getUnaRevista() {
		return unaRevista;
	}
	public void setUnaRevista(Revista[] unaRevista) {
		this.unaRevista = unaRevista;
	}
	public Libro[] getUnLibro() {
		return unLibro;
	}
	public void setUnLibro(Libro[] unLibro) {
		this.unLibro = unLibro;
	}
}
