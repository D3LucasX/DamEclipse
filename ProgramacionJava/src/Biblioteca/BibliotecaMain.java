package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class BibliotecaMain {
	public static void main(String[] args) {
		ArrayList<Articulo> articulos = new ArrayList<>();
		ArrayList<Prestamo> prestamos = new ArrayList<>();
		ArrayList<Usuario> usuarios = new ArrayList<>();
		ArrayList<Prestamo> prestamo = new ArrayList<>();
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
		
		menu(entrada,MiBiblioteca, articulos,prestamos, usuarios);
		
	}
	public static void menu(Scanner entrada, Bibliioteca MiBiblioteca, ArrayList<Articulo> articulos,ArrayList<Prestamo> prestamos,  ArrayList<Usuario> usuarios) {
		int seleccion = 0;
		do {
		System.out.println("----Menu Biblioteca----");
		System.out.println("1. Agregar Articulo ya en la lista");
		System.out.println("2. Agregar nuevo artículo");
		System.out.println("3. Buscar artículo por id.");
		System.out.println("4. Prestar articulo");
		System.out.println("5. Devolver Artículo");
		System.out.println("6. Mostrar todos los atrículos");
		System.out.println("7. Mostrar todos los préstamos");
		System.out.println("8. Mostrar prestamos por usuario");
		System.out.println("9. Salir");
		System.out.println("Seleccione la opcion que desee: ");
		seleccion = entrada.nextInt();
		entrada.nextLine();
		switch(seleccion) {
		case 1:
			/*
			 * Esta funcion nunca guarda un arículo, ya que si no los meto en
			 * la lista a mano en el main, la lista está vacía, por lo que 
			 * si los meto a mano en el main, y luego por esta funcion,
			 * ahi no daría problema, por que buscaría el artículo en la lista
			 * lo encontraría, y lo añadiría, por eso si lleno la lista a mano,
			 * si que me funciona.
			 * 
			 * Lo que se podría hacer es cambiar la funcion de agregar artículo,
			 * que le tengas que pasar por parámetro el artículo que quieras agregar, 
			 * y no que lo busque en la lista, porque la lista es la misma,
			 * así que si está vacía, no va a encontrar nada, así que articuloAagregar estara vacío
			 * 
			 * TODO: arreglar esto.
			 */
			Articulo articuloaAgregar = null;
			System.out.println("Que libro desea agregar? (Introduce el id del libro)");
			String eleccion = entrada.nextLine();
			for(Articulo articulo : articulos) {
				if(articulo.id.equals(eleccion)) {
					articuloaAgregar = articulo;
				}
			}
			MiBiblioteca.agregarArticulo(articuloaAgregar);
			break;
		case 2:
			//String id, String titulo, boolean disponible, String autor
			boolean estaDispon = true;
			System.out.println("Es un libro lo que quiere registrar?: ");
			String esLibro = entrada.nextLine();
			if (esLibro.equals("si") || esLibro.equals("Si")) {
				System.out.println("Introduce el ID: ");
				String idLib = entrada.nextLine();
				System.out.println("Introduce el título del libro: ");
				String titulo = entrada.nextLine();
				System.out.println("Esta disponible actualmente? (Si o no)");
				String disponible = entrada.nextLine();
				if (disponible.equals("Si") || disponible.equals("si")) {
					estaDispon = true;
				}else {
					estaDispon = false;
				}
				System.out.println("Introduce el nombre del autor: ");
				String nombreAutor = entrada.nextLine();
				Libro libroNuevo = new Libro(idLib, titulo, estaDispon, nombreAutor);
				MiBiblioteca.agregarArticulo(libroNuevo);
			}else {
				System.out.println("Introduce el ID: ");
				String idLib = entrada.nextLine();
				System.out.println("Introduce el título del libro: ");
				String titulo = entrada.nextLine();
				System.out.println("Esta disponible actualmente? (Si o no)");
				String disponible = entrada.nextLine();
				if (disponible.equals("Si") || disponible.equals("si")) {
					estaDispon = true;
				}else {
					estaDispon = false;
				}
				System.out.println("Introduce el número de edición: ");
				int numeroEdicion = entrada.nextInt();
				entrada.nextLine();
				Revista RevistaNueva = new Revista(idLib, titulo, estaDispon, numeroEdicion);
				MiBiblioteca.agregarArticulo(RevistaNueva);
			}
			break;
		case 3:
			System.out.println("Que libro desea buscar? (Introduce el ID del libro)");
			String eleccion2 = entrada.nextLine();
			System.out.println(MiBiblioteca.buscarArtPorId(eleccion2));
			System.out.println();
			break;
		case 4:
			Usuario seleccionUsu = null;
			System.out.println("Que id es del libro que quieres reservar?");
			String id = entrada.nextLine();
			Articulo articuloaReservar = MiBiblioteca.buscarArtPorId(id);
			if (articuloaReservar == null) {
			    System.out.println("Artículo no encontrado.");
			    break;
			}
			System.out.println("Que usuario eres? (Introduce el ID)");
			String eleccion3 = entrada.nextLine();
			for(Usuario usuario : usuarios) {
				if(usuario.getIdusuario().equals(eleccion3)) {
					seleccionUsu = usuario;
				}
			}
			if (seleccionUsu == null) {
				System.out.println("Usuario no encontrado.");
				break;
			}
			boolean comprobacion = MiBiblioteca.prestarArticulo(eleccion3,seleccionUsu,LocalDate.now());
			if(comprobacion == true) {
				 Prestamo nuevoPrestamo = new Prestamo(articuloaReservar, seleccionUsu, LocalDate.now());
				 prestamos.add(nuevoPrestamo);
				 nuevoPrestamo.incrementarContador();
				 articuloaReservar.setDisponible(false);
				 System.out.println("Nuevo prestamo realizado con éxito. ");
			}
			break;
		case 5:
			System.out.println("Dime el id del libro que quieres devolver: ");
			String idaDevolver =  entrada.nextLine();
			boolean devuelto = MiBiblioteca.devolverArticulo(idaDevolver);
			if(devuelto) {
				System.out.println("Articulo devuelto correctamente.");
				System.out.println();
			}else {
				System.out.println("No se ha podido devolver el artículo.");
				System.out.println();
			}
			break;
		case 6:
			MiBiblioteca.mostrarTodosArticulos();
			break;
		case 7:
			MiBiblioteca.mostrarPrestamos(prestamos);
			break;
		case 8:
			System.out.println("Escribe el ID del usuario que realizo el prestamo: ");
			String idUsu = entrada.nextLine();
			MiBiblioteca.mostrarPrestamoPorUsuario(prestamos, idUsu);
			break;
		case 9:
			System.out.println("SALIENDO...");
			break;
			default:
				System.out.println("Selección inválida, seleccione una opcion válida");
	}
	}while(seleccion != 9);

}
}
