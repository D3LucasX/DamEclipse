package Biblioteca;

import java.util.Scanner;

public class BibliotecaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca("Mi Biblioteca");

	}
	public static void crearLibro(Scanner entrada, Biblioteca biblioteca) {
		// Pasamos la instancia de la biblioteca para poder hacer uso de una funcion no static declarada en
		// la clase de la Biblioteca.
		System.out.print("ID del libro: ");
		int idLibro = entrada.nextInt();
		entrada.nextLine(); // Limpiar buffer

		System.out.print("Título del libro: ");
		String titulo = entrada.nextLine();

		System.out.print("Autor: ");
		String autor = entrada.nextLine();

		// Aquí se crea el objeto
		Libro nuevoLibro = new Libro(idLibro, titulo, true, autor);

		// Y aquí se lo pasas a la biblioteca
		biblioteca.agregarArticulo(nuevoLibro);
	}
	
	public static void crearRevista(Scanner entrada, Biblioteca biblioteca) {
		System.out.print("ID de la Revista: ");
		int idRevista = entrada.nextInt();
		entrada.nextLine(); // Limpiar buffer

		System.out.print("Título de la revista: ");
		String titulo = entrada.nextLine();

		System.out.print("Número de la edición: ");
		int numeroEdicion = entrada.nextInt();
		entrada.nextLine();

		// Aquí se crea el objeto
		Revista nuevaRevista = new Revista(idRevista, titulo, true, numeroEdicion);

		// Y aquí se lo pasas a la biblioteca
		biblioteca.agregarArticulo(nuevaRevista);
	}

}
