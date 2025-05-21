package Biblioteca;

import java.time.LocalDate;

public class Prestamo {
	private Articulos articulo;
	private LocalDate fechaPrestamo;
	private boolean devuelto;
	
	public Prestamo(Articulos articulo, LocalDate fechaPrestamo) {
		this.articulo = articulo;
		this.fechaPrestamo = fechaPrestamo;
		this.devuelto = false;
		
		articulo.incrementarContadorPrestamos();
		articulo.setDisponivilidad(false);
	}
	public void devolver() {
		this.devuelto = true;
		articulo.setDisponivilidad(true);
	}
	
	@Override
	public String toString() {
		String estado = devuelto ? "Artículo devuelto" : "Pendiente de devolver";
		return "Prestamo articulo: " + articulo + 
				"Fecha del préstamo: " + fechaPrestamo + 
				"Devolucion realizada: " + estado;
	}
	public Articulos getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	
	
	
}
