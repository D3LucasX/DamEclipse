package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int ini=0;
		String palabra="";
		Scanner entrada = new Scanner(System.in);
		palabra = entrada.nextLine().toLowerCase();
		int len = palabra.length();
		int fin = len -1;
		if(isPalin(palabra,ini,fin)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}
	private static boolean isPalin(String palabra, int ini, int fin) {
		if(ini >= fin) {
			return true;
		}
		if(palabra.charAt(ini) != palabra.charAt(fin)) {
			return false;
		}
		return isPalin(palabra, ini +1, fin -1);
	}

}
