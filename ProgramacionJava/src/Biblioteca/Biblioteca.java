package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
	String nombre;
	private ArrayList<Articulos> articulos;
	private ArrayList<Prestamo> prestamos;
	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
		this.articulos = new ArrayList<>();
        this.prestamos = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Articulos> getArticulos() {
		return articulos;
	}
	public void setArticulos(ArrayList<Articulos> articulos) {
		this.articulos = articulos;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	public void agregarArticulo(Articulos articulo) {
		articulos.add(articulo);
	}
	public Articulos buscarArticuloPorId(int id) {
	    for (Articulos articulo : articulos) {
	        if (articulo.getId() == id) {
	            return articulo;
	        }
	    }
	    return null; // No encontrado
	}
}
