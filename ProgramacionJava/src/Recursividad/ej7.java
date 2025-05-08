package Recursividad;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Suma de 1 a 5: " + sumaNatural(5));
	}
	private static int sumaNatural(int n) {
		if(n == 1) return 1;
		int suma = sumaNatural(n-1);
		return suma + n;
	}

}
