package Recursividad;

public class obtenerNumBinario {

	public static void main(String[] args) {
		int n = 123;
		String resultado = aBinario(n);
		System.out.println(resultado);
	}
	public static String aBinario(int n) {
		if(n == 0) return "0";
		if (n == 1) return "1";
		return aBinario (n/2) + (n%2);
	}

}
