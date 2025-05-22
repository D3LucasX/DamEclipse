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
		System.out.println("1. Agregar Articulo");
		System.out.println("2. Buscar artículo por id.");
		System.out.println("3. Prestar articulo");
		System.out.println("4. Devolver Artículo");
		System.out.println("5. Mostrar todos los atrículos");
		System.out.println("6. Mostrar todos los préstamos");
		System.out.println("7. Mostrar prestamos por usuario");
		System.out.println("8. Salir");
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
			System.out.println("Que libro desea agregar? 1 o 2");
			String eleccion = entrada.nextLine();
			for(Articulo articulo : articulos) {
				if(articulo.id.equals(eleccion)) {
					articuloaAgregar = articulo;
				}
			}
			MiBiblioteca.agregarArticulo(articuloaAgregar);
			break;
		case 2:
			System.out.println("Que libro desea buscar? 1 o 2");
			String eleccion2 = entrada.nextLine();
			MiBiblioteca.buscarArtPorId(eleccion2);
			break;
		case 3:
			Usuario seleccionUsu = null;
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
			break;
		case 4:
			System.out.println("Dime el id del libro que quieres devolver: ");
			String idaDevolver =  entrada.nextLine();
			MiBiblioteca.devolverArticulo(idaDevolver);
		case 5:
			MiBiblioteca.mostrarTodosArticulos();
		case 6:
			MiBiblioteca.mostrarPrestamos(prestamos);
		case 7:
			System.out.println("Escribe el ID del usuario que realizo el prestamo: ");
			String idUsu = entrada.nextLine();
			MiBiblioteca.mostrarPrestamoPorUsuario(prestamos, idUsu);
			break;
		case 8:
			System.out.println("SALIENDO...");
			break;
			default:
				System.out.println("Selección inválida, seleccione una opcion válida");
	}
	}while(seleccion != 8);

}
}
