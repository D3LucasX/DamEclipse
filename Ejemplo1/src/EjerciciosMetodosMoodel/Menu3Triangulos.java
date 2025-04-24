package EjerciciosMetodosMoodel;

import java.util.Scanner;

public class Menu3Triangulos {

	public static void main(String[] args) {
		int altura;
		int base;
		int decision;
		Scanner entrada = new Scanner(System.in);
		do {
		mostrarMenu();
		decision = decisionInicial(entrada);
		menu(decision, entrada);
		}while (decision != 4);
		
		
	}	

	// FUNCIONES:

	// TRIANGULO ISO VACÍO
	private static void CrearTrianguloIsoVacio(int altura) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				if (k == 0 || k == i * 2 || i == altura - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// TRIÁNGULO ISO RELLENO
	private static void CrearTrianguloIsoRelleno(int altura) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// TRIÁNGULO RECTÁNGULO RELLENO
	private static void CrearTrianguloRectanguloRelleno(int altura) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// TRIÁNGULO RECTÁNGULO VACÍO
	private static void CrearTrianguloRectanguloVacio(int altura) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1 || i == altura) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// RECTANGULO VACÍO
	private static void CrearRectanguloVacio(int altura, int base) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (i > 0 && i < altura - 1) {
					if (j > 0 && j < base - 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	// RECTANGULO RELLENO
	private static void CrearRectanguloRelleno(int altura, int base) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// COMPROBACION DE SI LA ELECCION ES CORRECTA
	private static int RellenoOVacio(Scanner entrada) {
		boolean choose = false;
		int decision = 0;
		do {
			System.out.print("Elija una opción (1 o 2): "); 
			if (entrada.hasNextInt()) {
				decision = entrada.nextInt();
				if (decision == 1 || decision == 2) {
					choose = true;
				} else {
					System.out.println("Por favor, introduzca una opción posible (1 o 2)");
				}
			} else {
				System.out.println("Entrada no válida. Tienes que introducir un número del 1 al 2.");			
			}
			entrada.nextLine();
		} while (choose == false);
		return decision;
	}

	// COMPROBACION DE LA DECISION INICIAL
	private static int decisionInicial(Scanner entrada) {
		int decision = 0;
		boolean choose = false;
		do {
			System.out.print("Elija una opción (1, 2, 3 o 4): ");
			if (entrada.hasNextInt()) {
				decision = entrada.nextInt();
				if (decision == 1 || decision == 2 || decision == 3 || decision == 4) {
					choose = true;
				} else {
					System.out.println("Por favor, introduzca una opción posible (1, 2, 3 o 4)");
				}
			} else {
				System.out.println("Entrada no válida. Tienes que introducir un número del 1 al 4.");
			}
			entrada.nextLine(); // Limpia la entrada incorrecta
		} while (choose == false);
		return decision;
	}
	
	// MENU
	private static void menu(int decision, Scanner entrada) {
		int altura = 0;
		int base = 0;
		
			switch (decision) {
			case 1:
				System.out.println("Cual desea imprimir, el rectángulo relleno o el vacío?");
				System.out.println("1. Relleno");
				System.out.println("2. Vacío");
				decision = RellenoOVacio(entrada);

				altura = DeterminarAltura(entrada);
				base = DeterminarBase(entrada);

				if (decision == 1) {
					CrearRectanguloRelleno(altura, base);
				} else {
					CrearRectanguloVacio(altura, base);
				}
				break;

			case 2:
				System.out.println("Cual desea imprimir, el Triángulo rectángulo relleno o el vacío?");
				System.out.println("1. Relleno");
				System.out.println("2. Vacío");
				decision = RellenoOVacio(entrada);

				altura = DeterminarAltura(entrada);

				if (decision == 1) {
					CrearTrianguloRectanguloRelleno(altura);
				} else {
					CrearTrianguloRectanguloVacio(altura);
				}
				break;

			case 3:
				System.out.println("Cual desea imprimir, el Triángulo Isósceles relleno o el vacío?");
				System.out.println("1. Relleno");
				System.out.println("2. Vacío");

				decision = RellenoOVacio(entrada);
				altura = DeterminarAltura(entrada);

				if (decision == 1) {
					CrearTrianguloIsoRelleno(altura);
				} else {
					CrearTrianguloIsoVacio(altura);
				}
				break;
			default:
				System.out.println("Finalizando...");
				return;
			}
		}
	
	private static void mostrarMenu() {
		
		System.out.println("Seleccione la opción que desee imprimir: (Seleccione el numero de la opción)");
		System.out.println("1. Rectángulo ");
		System.out.println("2. Triángulo Rectángulo");
		System.out.println("3. Triangulo Isoósceles");
		System.out.println("4. Salir del menú");
	}

	// PEDIR Y COMPROBAR LA ALTURA
	private static int DeterminarAltura(Scanner entrada) {
		int altura = 0;
		boolean verdad = false;
		do {
			System.out.println("Dime la altura: ");
			if (entrada.hasNextInt()) {
				altura = entrada.nextInt();
				verdad = true;
			} else {
				System.out.println("Entrada no válida. Tienes que introducir un número.");
				entrada.next();
			}
		} while (verdad == false);
		return altura;
	}

	// PEDIR Y COMPROBAR LA BASE
	private static int DeterminarBase(Scanner entrada) {
		int base = 0;
		boolean verdad = false;
		do {
			System.out.println("Dime la base: ");
			if (entrada.hasNextInt()) {
				base = entrada.nextInt();
				verdad = true;
			} else {
				System.out.println("Entrada no válida. Tienes que introducir un número.");
				entrada.next();
			}
		} while (verdad == false);
		return base;
	}

}
