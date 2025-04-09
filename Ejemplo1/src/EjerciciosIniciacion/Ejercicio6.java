package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String[] args) {
		String palabraMayor = "";
		int longTemp = 0;
		int lonMayor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce la palabra numero : " + (i+1));
			String palabra = entrada.nextLine();
			int lonTemp= palabra.length();
			if(lonTemp > lonMayor) {
				lonMayor = lonTemp;
				palabraMayor= palabra;			
			}
		}
		System.out.println("Palabra com mayor longitud = " + palabraMayor);
		System.out.println("El tamaño mayor = " + lonMayor);
	}
}
