package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int altura = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame la altura del rectángulo");
		altura = entrada.nextInt();
		CrearTrianguloRectangulo(altura);
	}
	private static void CrearTrianguloRectangulo(int altura) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 0; j < i; j++) {
			if( j == 0 || j == i-1 || i == altura) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
