package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class BibliotecaMain {
	public static void main(String[] args) {
		ArrayList<Articulo> articulos = null;
		ArrayList<Prestamo> prestamos = null;
		ArrayList<Usuario> usuarios = null;
		ArrayList<Prestamo> prestamo = null;
		Scanner entrada = new Scanner(System.in);
		// Mi biblioteca
		Bibliioteca MiBiblioteca = new Bibliioteca("Biblioteca de los iulian drakaris",articulos, prestamos );
		// 2 libros
		Libro libro1 = new Libro("1", "Java para principiantes?", true, "Jose Maria De Lucas");
		articulos.add(libro1);
		Libro libro2 = new Libro("2", "Java para expertos", true, "Jose Maria De Lucas");
		articulos.add(libro2);
		// 2 Revistas
		Revista revista1 = new Revista("3", "Revista de actualidad", true, 1);
		articulos.add(revista1);
		Revista revista2 = new Revista("4", "Revista de moda", true, 2);
		articulos.add(revista2);
		// 2 Usuarios
		Usuario usuario1 = new Usuario("1", "Pepe");
		usuarios.add(usuario1);
		Usuario usuario2 = new Usuario("2", "Juan");
		usuarios.add(usuario2);
	}
	public static void menu(Scanner entrada, Bibliioteca MiBiblioteca, ArrayList<Articulo> articulos, ArrayList<Usuario> usuarios) {
		int seleccion = 0;
		System.out.println("----Menu Biblioteca----");
		System.out.println("1. Agregar Articulo");
		System.out.println("2. Buscar artículo por id.");
		System.out.println("3. Prestar articulo");
		System.out.println("4. Devolver Artículo");
		System.out.println("5. Mostrar todos los atrículos");
		System.out.println("6. Mostrar todos los préstamos");
		System.out.println("7. Mostrar prestamos por usuario");
		switch(seleccion) {
		case 1:
			Articulo articuloaAgregar = null;
			System.out.println("Que libro desea agregar? 1 o 2");
			String eleccion = entrada.nextLine();
			for(Articulo articulo : articulos) {
				if(articulo.id == eleccion) {
					articuloaAgregar = articulo;
				}
			}
			MiBiblioteca.agregarArticulo(articuloaAgregar);
		case 2:
			System.out.println("Que libro desea buscar? 1 o 2");
			String eleccion2 = entrada.nextLine();
			MiBiblioteca.buscarArtPorId(eleccion2);
		case 3:
			Usuario seleccionUsu = null;
			//String idUsu, Usuario usuario, LocalDate fecha
			System.out.println("Que id es del libro que quieres reservar?");
			String id = entrada.nextLine();
			Articulo articuloaReservar = MiBiblioteca.buscarArtPorId(id);
			System.out.println("Que usuario eres? 1 0 2");
			String eleccion3 = entrada.nextLine();
			for(Usuario usuario : usuarios) {
				if(usuario.getIdusuario()== eleccion3) {
					seleccionUsu = usuario;
				}
			boolean comprobacion = MiBiblioteca.prestarArticulo(eleccion3,seleccionUsu,LocalDate.now());
			if(comprobacion == true) {
				 Prestamo nuevoPrestamo = new Prestamo(articuloaReservar, seleccionUsu, LocalDate.now());
				 nuevoPrestamo.incrementarContador();
			}
			}
		case 4:
			System.out.println("Dime el id del libro que quieres devolver: ");
			String idaDevolver =  entrada.nextLine();
			MiBiblioteca.devolverArticulo(idaDevolver);
			
	}

}
}
