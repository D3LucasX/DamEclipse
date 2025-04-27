package PracticasExamen;

public class CuadradoDeDigitosDeNumero {

	public static void main(String[] args) {
		int n = 9184;
		
		System.out.println(squareDigits(n));
		
	}
		public static int squareDigits(int n) {
		    String strNum = String.valueOf(n);  // Convertir el número a String
		    StringBuilder cadenaNumerica = new StringBuilder();

		    for (int i = 0; i < strNum.length(); i++) {
		        int digito = Character.getNumericValue(strNum.charAt(i));  // Obtener dígitos en orden correcto
		        int digitoCuadrado = digito * digito;  // Elevar al cuadrado
		        cadenaNumerica.append(digitoCuadrado);  // Agregar el resultado
		    }

		    return Integer.parseInt(cadenaNumerica.toString()); // Convertir el resultado en int
	}

}
