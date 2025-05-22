package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bibliioteca {
	private String nombre;
	private ArrayList<Articulo> articulos;
	private ArrayList<Prestamo> prestamos;
	public Bibliioteca(String nombre, ArrayList<Articulo> articulos, ArrayList<Prestamo> prestamos) {
		this.nombre = nombre;
		this.articulos = articulos;
		this.prestamos = prestamos;
		
	}
	public void agregarArticulo(Articulo nuevoArticulo) {
		this.articulos.add(nuevoArticulo); // pasamos por parametro el articulo a agregar
	}
	public Articulo buscarArtPorId(String idAbuscar) {
		Articulo articuloEncontrado = null;
		for(Articulo articulo : articulos) {
			if (articulo.getId() == idAbuscar) {
				articuloEncontrado = articulo;
			}
		}
		return articuloEncontrado;
	}
	
	public boolean prestarArticulo(String idUsu, Usuario usuario, LocalDate fecha) {
		boolean dispon = false;
		Articulo articuloAprestar = null;
		while(dispon) {
			articuloAprestar = buscarArtPorId(idUsu);
			if(!articuloAprestar.isDisponible()) {
				System.out.println("El articulo que busca no está disponible");
			}else {
				System.out.println("Artículo disponible");
				dispon = true;
				return true;
			}
		}
		return false;
	}
	
	public boolean devolverArticulo(String idAdevolver) {
		Articulo articuloAdevolver = buscarArtPorId(idAdevolver);
		String idPrestado = articuloAdevolver.getId();
		for(Prestamo prestamo : prestamos) {
			if (idPrestado == articuloAdevolver.id && !articuloAdevolver.isDisponible()) {
				return true;
			}
		}
		return false;
	}
	public void mostrarTodosArticulos() {
		for (Articulo articulo : this.articulos) {
			if (articulo != null) {
				System.out.println(articulo);
			}
		}
	}
	public void mostrarPrestamos(ArrayList<Prestamo> prestamos) {
		for(Prestamo prestamo : prestamos) {
			System.out.println(prestamo.toString());
		}
	}
	public void mostrarPrestamoPorUsuario(ArrayList<Prestamo> prestamos, String usuarioAbuscar) {
		for(Prestamo prestamo : prestamos) {
			Usuario usuPrestamo = prestamo.getUsuario();
			if (usuPrestamo.getIdusuario() == usuarioAbuscar) {
				System.out.println(prestamo.toString());
			}
		}
	}
	@Override
	public String toString() {
		return "Bibliioteca [nombre=" + nombre + ", articulos=" + articulos + ", prestamos=" + prestamos + "]";
	}
	
}
