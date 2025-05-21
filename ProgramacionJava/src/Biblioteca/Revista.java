package Biblioteca;

public class Revista extends Articulos{
	int numeroEdicion;

	public Revista(int id, String titulo, boolean disponivilidad, int numeroEdicion) {
		super(id, titulo, disponivilidad);
		this.numeroEdicion = numeroEdicion;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	
}
