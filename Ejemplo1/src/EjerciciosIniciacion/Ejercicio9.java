package EjerciciosIniciacion;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int altura = 0;
		int base = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame la altura del rectángulo");
		altura = entrada.nextInt();
		System.out.println("Dame la base del rectángulo");
		base = entrada.nextInt();
		CrearRectangulo(altura,base);
	}
	private static void CrearRectangulo(int altura, int base) {
		for (int i = 0; i < altura; i ++) {
			for (int j = 0; j < base; j ++) {
				if(i > 0 && i < altura -1) {
					if(j > 0 && j < base -1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
