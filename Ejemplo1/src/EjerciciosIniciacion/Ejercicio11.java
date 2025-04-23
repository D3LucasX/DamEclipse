package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int altura = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame la altura del rectángulo");
		altura = entrada.nextInt();
		CrearTrianguloIso(altura);
		CrearTrianguloIsoVacio(altura);
	}
	private static void CrearTrianguloIso(int altura) {
		for(int i = 0; i < altura; i++) {
			for (int j = 0; j < altura-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void CrearTrianguloIsoVacio(int altura) {
		for(int i = 0; i < altura; i++) {
			for (int j = 0; j < altura-i; j++) {
				System.out.print(" ");
			}
				for(int k = 0; k < i*2+1; k++) {
					if( k == 0 || k == i*2 || i == altura-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
		}
	}
}

