package PracticasExamen;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int operacion = 0;
		do{
			operacion = eleccionOperacion(entrada);
			operacion(operacion, entrada);
		}while (operacion != 6);

	}
	private static int eleccionOperacion(Scanner entrada){
		System.out.println("Qu operacion desea realizar?");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Porcentaje");
		System.out.println("6. Salir");
		int operacion = entrada.nextInt();
		entrada.nextLine();
		
		return operacion;
	}
	
	private static void operacion(int operacion, Scanner entrada) {
		double suma = 0, resta=0, multiplicacion = 0, division = 1;
		int cantidadNumeros = 0;
		switch (operacion) {
		case 1:
			System.out.println("¿Cuantos números desea Sumar?");
			cantidadNumeros = entrada.nextInt();
			entrada.nextLine();
			for(int i = 0; i < cantidadNumeros; i++) {
				System.out.println("Introduzca el numero " + (i+1));
				suma += entrada.nextInt();
				entrada.nextLine();
			}
			System.out.println("El resultado de la Suma es: " + suma);
			break;
		case 2:
			System.out.println("¿Cuantos números desea Restar?");
			cantidadNumeros = entrada.nextInt();
			entrada.nextLine();
			double[] numeros = new double[cantidadNumeros];
			for(int i = 0; i < cantidadNumeros; i++) {
				System.out.println("Introduzca el numero " + (i+1));
				numeros[i] = entrada.nextInt();
				entrada.nextLine();
			}
			resta = numeros[0];
			for (int i = 1; i < cantidadNumeros; i ++) {
				resta -= numeros[i];
			}
			System.out.println("El resultado de la Resta es: " + resta);
			break;
		case 3:
			System.out.println("¿Cuantos números desea Multiplicar?");
			cantidadNumeros = entrada.nextInt();
			entrada.nextLine();
				double[] numeros2 = new double[cantidadNumeros];
				for(int i = 0; i < cantidadNumeros; i++) {
					System.out.println("Introduzca el numero " + (i+1));
					numeros2[i] = entrada.nextDouble();
					entrada.nextLine();
				}
				multiplicacion = numeros2[0];
				for (int i = 1; i < cantidadNumeros; i ++) {
					multiplicacion *= numeros2[i];
				}
				
			System.out.println("El resultado de la Multiplicación es: " + multiplicacion);
			break;
		case 4:
			double[] numeros3 = new double[2];
			for(int i = 0; i < 2; i++) {
				System.out.println("Introduzca el numero " + (i+1) + " para la division" );
				numeros3[i] = entrada.nextDouble();
				entrada.nextLine();
			}
			division = numeros3[0];
			for (int i = 1; i < 2; i ++) {
				division /= numeros3[i];
			}
			System.out.println("El resultado de la División es: " + division);
			break;
		case 5:
			System.out.println("Dime de que numero quieres saber el porcentaje: ");
			double numeroPorcen = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Que porcentaje le quieres aplicar a ese número? ");
			double porcen = entrada.nextInt();
			entrada.nextLine();
			porcen = porcen / 100;
			double resultPorcen = numeroPorcen * porcen;
			System.out.println("El resultado de el porcentaje es: " + resultPorcen);
			break;
		case 6:
			System.out.println("Saliendo...");
			break;
			default:
				System.out.println("No ha seleccionado una opcion adecuada.");
				break;
		}
	}

}