package Recursividad;

import java.util.ArrayList; 


public class imprimirNInvertido {

	public static void main(String[] args) {
		int n = 123456789;
		int[] array = obtenerDigitos(n);
		StringBuilder num = new StringBuilder();
		for(int i = array.length - 1; i >= 0; i--) {
			num.append(array[i]);
		}
		int numero = Integer.parseInt(num.toString());
		System.out.println(numero);
	}
	public static int[] obtenerDigitos(int n) {
		ArrayList<Integer> lista = new ArrayList<>();
		seccionarDigitos(n, lista);
		
		int []resultado = new int[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			resultado[i] = lista.get(i);
		}
		return resultado;
	}
	
	private static void seccionarDigitos(int n, ArrayList<Integer> lista) {
		if (n < 10) {
			lista.add(n);
		}else {
			seccionarDigitos(n / 10, lista);
			lista.add(n%10);
		}
	}
}

