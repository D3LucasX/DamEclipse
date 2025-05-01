package PracticasExamen;

public class rombo {

	public static void main(String[] args) {
		int altura = 10;
		rombo(altura);
	}
	private static void rombo(int altura) {
		
		//Triangulop de arriba del rombo
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura -i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i*2+1; k++) {
				if(k == 0 || k == i * 2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// Linea del medio.
		for(int i = altura; i < altura +1; i++) {
			for (int j = 0; j < i*2+1; j++) {
				if (j == 0 || j == i*2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
		
		//Triangulo de abajo del rombo
		for(int i = altura-1; i >= 0; i--) {
			for(int j = altura -i; j > 0; j-- ) {
				System.out.print(" ");
			}
			for (int k = 0; k < i*2+1; k++) {
				if(k == 0 || k == i * 2 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
