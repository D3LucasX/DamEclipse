package Biblioteca;

public class Articulos {
	int id;
	String titulo;
	boolean disponivilidad;
	int contadorPrestamos;
	public Articulos(int id, String titulo, boolean disponivilidad) {
		this.id = id;
		this.titulo = titulo;
		this.disponivilidad = disponivilidad;
		this.contadorPrestamos = 0;
		
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
	public void incrementarContadorPrestamos() {
        this.contadorPrestamos++;
    }
	
}
