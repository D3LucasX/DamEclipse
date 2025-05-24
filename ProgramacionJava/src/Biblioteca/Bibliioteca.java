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
	public boolean idRepetido(String idAbuscar) {
		for (Articulo articulo : articulos) {
			if(articulo.getId().equals(idAbuscar)) {
				return true;
			}
		}
		return false;
	}
	public void agregarArticulo(Articulo nuevoArticulo) {
		this.articulos.add(nuevoArticulo); // pasamos por parametro el articulo a agregar
		System.out.println("Articulo agregado con exito. ");
		System.out.println();
	}
	public Articulo buscarArtPorId(String idAbuscar) {
		Articulo articuloEncontrado = null;
		for(Articulo articulo : articulos) {
			if (articulo.getId().equals(idAbuscar)) {
				articuloEncontrado = articulo;
				return articuloEncontrado;
			}
		}
		return null;
	}
	
	public boolean prestarArticulo(String idUsu, Usuario usuario, LocalDate fecha) {
		boolean dispon = false;
		Articulo articuloAprestar = null;
			articuloAprestar = buscarArtPorId(idUsu);
			/*
			 * Comprobamos primero si el articulo es null para que si lo es, no trate de buscar el id de un
			 * null por que daria el error de nullpointer
			 */
			if (articuloAprestar == null) {
		        System.out.println("No se encontró el artículo con ID: " + idUsu);
		        return false;
		    }
			if(!articuloAprestar.isDisponible()) {
				System.out.println("El articulo que busca no está disponible");
				return false;
			}else {
				System.out.println("Artículo disponible");
				dispon = true;
				return true;
			}
	}
	
	public boolean devolverArticulo(String idAdevolver) {
		 Articulo articuloAdevolver = buscarArtPorId(idAdevolver);
		 	// Si no encuentra el artículo.
		    if (articuloAdevolver == null) {
		        System.out.println("Artículo no encontrado.");
		        return false;
		    }

		    // Buscamos el préstamo correspondiente
		    Prestamo prestamoAEliminar = null;
		    for (Prestamo prestamo : prestamos) {
		        if (prestamo.getArticulo().getId().equals(articuloAdevolver.getId())) {
		            prestamoAEliminar = prestamo;
		            break;
		        }
		    }
		    // Si lo encuentra el prestamo(Si no está a null) y no está disponible
		    	// Lo pone en disponible y lo elimina de la lista con remove.
		    if (prestamoAEliminar != null && !articuloAdevolver.isDisponible()) {
		        articuloAdevolver.setDisponible(true);
		        prestamos.remove(prestamoAEliminar);
		        return true;
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
			if (usuPrestamo.getIdusuario().equals(usuarioAbuscar)) {
				System.out.println(prestamo.toString());
			}
		}
	}
	@Override
	public String toString() {
		return "Bibliioteca [nombre=" + nombre + ", articulos=" + articulos + ", prestamos=" + prestamos + "]";
	}
	
}
