package Biblioteca;

import java.time.LocalDate;

public class Prestamo {
	Articulo articulo;
	Usuario usuario;
	LocalDate fecha;
	static int contadorPrestamos=0;
	public Prestamo(Articulo articulo, Usuario usuario, LocalDate fecha) {
		this.articulo = articulo;
		this.usuario = usuario;
		this.fecha = fecha;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public static int getContadorPrestamos() {
		return contadorPrestamos;
	}
	public static void setContadorPrestamos(int contadorPrestamos) {
		Prestamo.contadorPrestamos = contadorPrestamos;
	}
	
	public void incrementarContador() {
		this.contadorPrestamos++;
	}
	@Override
	public String toString() {
		return "Prestamo [articulo=" + articulo + ", usuario=" + usuario + ", fecha=" + fecha + "]";
	}
	
}
