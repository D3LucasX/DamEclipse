package EjerciciosIniciacion;

import java.util.Scanner;

// EN ESTE EJERCICIO LO QUE HACEMOS ES QUE INTRODUCIOMOS UNA PALABRA Y LA IMPRIME PONIENDO UN ESPACIO ENTRE CADA CARACTER.
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = entrada.nextLine();
		for(int i = 0; i < palabra.length(); i++) {
			
			System.out.print(palabra.charAt(i) + " ");
		}

	}

}
