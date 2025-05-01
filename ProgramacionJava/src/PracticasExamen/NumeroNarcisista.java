package PracticasExamen;

import java.util.Scanner;
//es un número entero que es igual a la suma de sus dígitos elevados a la potencia del número de dígitos del número.
//Por ejemplo, 153 es un número narcisista porque 1³ + 5³ + 3³ = 1 + 125 + 27 = 153. 

public class NumeroNarcisista {

	public static void main(String[] args) {
		System.out.print("Introduce un numero para saber si es narcisista: ");
		Scanner entrada = new Scanner(System.in);
		int number = entrada.nextInt();
		
		isNarcissistic(number);

	}
	public static boolean isNarcissistic(int number) {
	      int original = number;
	      int resultado = 0;
	      int digitCount = Integer.toString(number).length();  // devuelve 3
	        for (int i = 0; i < digitCount; i++){
	          int digit = number % 10;
	          int elevado = (int)Math.pow(digit, digitCount);
	          resultado += elevado;
	          number /= 10;
	        }
	      if (resultado == original){
	        System.out.println(original + " is narcissistic");
	        return true;
	      }else{
	        System.out.println(original + " is not narcissistic");
	        return false;
	      }
	    }

}
