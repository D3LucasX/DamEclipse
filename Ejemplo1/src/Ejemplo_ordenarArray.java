import java.util.Scanner;

public class Ejemplo_ordenarArray {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int cantidad = cantidadNumeros();
		int[] numeros = insertarNumeros(cantidad);
		for (int i = 0; i < cantidad; i ++) {
			System.out.println(i + " - " + numeros[i]);
		}
		int ContadorMayor = encontrarMayor(cantidad, numeros);
		System.out.println("La cantidad de veces que se repite el mayor es " + ContadorMayor);
		int ContadorMenor = encontrarMenor (cantidad, numeros);
		System.out.println("La cantidad de veces que se repite el menor  es " + ContadorMenor);
		
	
	}
	private static int cantidadNumeros() {
		System.out.println("¿Cuantos numeros quieres que tenga el array?");
		int cantidad = entrada.nextInt();
		return cantidad;
	}
	private static int[] insertarNumeros(int cantidad) {
		int[] numeros = new int[cantidad];
		for (int i = 0; i < cantidad ; i++) {
			System.out.println("Introduce el número en la posicion " + i + ": ");
			numeros[i] = entrada.nextInt();
	}
		return numeros;
	}
	private static int encontrarMayor(int cantidad, int[]numeros) {
		int mayor = numeros [0];
		int contadorMayor = 0;
		for(int i = 1; i < cantidad; i++) {
			if (mayor < numeros[i]) {
				mayor = numeros[i];
			}else {
				continue;
			}
		}
		for (int i = 0; i < cantidad; i++) {
			if (mayor == numeros [i]) {
				contadorMayor ++;
			}
		}
		System.out.println("El numero mayor es : " + mayor);
		return contadorMayor;
	}
	private static int encontrarMenor (int cantidad, int [] numeros) {
		int menor = numeros [0];
		int contadorMenor = 0;
		for(int i = 1; i < cantidad; i++) {
			if (menor > numeros[i]) {
				menor = numeros[i];
			}
		}
		for (int i = 0; i < cantidad; i++) {
			if (menor == numeros [i]) {
				contadorMenor ++;
			}
		}
		System.out.println("El numero mayor es : " + menor);
		return contadorMenor;
}
}

