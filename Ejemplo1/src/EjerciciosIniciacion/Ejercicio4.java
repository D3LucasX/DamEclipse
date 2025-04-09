package EjerciciosIniciacion;

import java.util.Scanner;


// ESTE EJERCICIO LO QUE HACE ES QUE DE NUMEROS QUE NTRODUCES POR PANTALLA, SOLO TE SUMARA LOS QUE LA SUMA DE SUS CIFRAS SEA IGUAL AL NUMERO DE DIGITOS QUE TIENE EL NUMERO
public class Ejercicio4 {
	public static void main(String[] args) {
		int numeros = 0, resultado, digitos, total = 0, temp = 0;
		String frase =  "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número >= que 0");
		numeros = entrada.nextInt();
		while (numeros > 0) {
			digitos = 0;
			resultado = 0;
			temp = numeros;
			while(temp > 0) {
				resultado += temp%10; // Math.log10(temp) + 1; ALGORITMO PARA SACAR LA CANTIDAD DE DÍGITOS QUE TIENE UN NÚMERO, sE NECESITA IMPORTAR LA CLASE MATH PERO SE IMPORTA SOLA
				digitos += 1;
				temp /= 10;
			}
			if (resultado == digitos) {
				frase += numeros + "+";
				total += numeros;
			}
			System.out.println("Introduce un número >= que 0");
			numeros = entrada.nextInt();
		}
		frase += numeros+ "=";
		System.out.println("El resultado es " + frase + total);
		entrada.close();
	}

}
