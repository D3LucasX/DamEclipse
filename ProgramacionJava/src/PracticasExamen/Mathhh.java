package PracticasExamen;

public class Mathhh {
	// Metodos de la clase Math
	public static void main(String[] args) {
		double num = 564.74543d;
		double numRound;
		double elevadoA = 7;
		System.out.println("Númerop mas cercano: " + (numRound=Math.round(num))); // Redondea al número mas cercano.
		System.out.println("Redoindeo a la baja: " + (numRound=Math.floor(num))); // Redondea al número mas bajo.
		System.out.println("Redoindeo a la alta: " + (numRound=Math.ceil(num))); // Redondea al número mas alto
		System.out.println("Raiz cuadrada de num:  " + (numRound=Math.sqrt(num))); // devuelve la raiz cuadrada del num
		System.out.println("Num elevado A 7(En este ejemplo): " + (numRound=Math.pow(num, elevadoA))); // devuelve um elevado a (El numero que quieras)
	}

}
