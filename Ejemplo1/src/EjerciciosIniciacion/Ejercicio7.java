package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main (String[] args) {
		int espacioEncontrado = 0;
		int contadorPalabras = 0  ;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto = entrada.nextLine();
		
		if(texto.length()==0) return 0; // SI LE DA AL ESPACIO NADA MAS EMPEZAR.(DA ERROR PORQUE AL NO SER UNA FUNCION NO DEVUELVE NADA.)
		
		if(Character.isLetter(texto.charAt(0))) {
			contadorPalabras ++;
		}
		for(int i = 0; i < texto.trim().length(); i++) {

			if (texto.charAt(i) == ' ' && Character.isLetter(texto.charAt(i + 1))) {
				contadorPalabras ++;
				espacioEncontrado ++;
			}
		}
		System.out.println("El total de palabras que hay es: " + contadorPalabras);
	}

}
