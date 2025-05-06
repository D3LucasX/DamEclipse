package Recursividad;

/*import java.util.ArrayList; 
import java.util.Arrays;*/
import java.util.Scanner;

public class Ejercicio1_digitos {

	public static void main(String[] args) {
		/*Scanner entrada = new Scanner(System.in);
		System.out.print("Que número desea seccionar?: ");
		int n = entrada.nextInt();
		entrada.nextLine();
		int contador = 0;
		System.out.println("El array de digitos es: ");
		
		int[] digitos = obtenerDigitos(n);
		System.out.println(Arrays.toString(digitos));

	}
	
	// Principal function, uses the list of the auxiliary function, turns it into an array, and return it.
	public static int[] obtenerDigitos(int n) {
		ArrayList<Integer> lista = new ArrayList<>();
		seccionarDigitos(n, lista);
		
		int []resultado = new int[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			resultado[i] = lista.get(i);
		}
		return resultado;
	}
	
	// Auxiliary function that splits n into digits and adds them into a list.
	private static void seccionarDigitos(int n, ArrayList<Integer> lista) {
		if (n > 0 && n < 9) {
			lista.add(n);
		}else {
			seccionarDigitos(n / 10, lista);
			lista.add(n%10);
		}
	}*/
		Scanner entrada = new Scanner(System.in);
		System.out.print("Que número desea seccionar?: ");
		int n = entrada.nextInt();
		entrada.nextLine();
		int[] digitos = obtenerDigitos(n);
        imprimirArray(digitos);  // imprime: 1, 2, 3, 4

	}
	public static int contarDigitos(int n) {
		if(n < 10) {
			return 1;
		}else {
			return 1 + contarDigitos(n/10);
		}
	}
	
	public static void llenarArray(int n, int array[], int posicion) {
		if (n < 10) {
            array[posicion] = n;
        } else {
            llenarArray(n / 10, array, posicion - 1);
            array[posicion] = n % 10;
        }
	}
	
	public static int[] obtenerDigitos(int n) {
        int longitud = contarDigitos(n);
        int[] resultado = new int[longitud];
        llenarArray(n, resultado, longitud - 1);
        return resultado;
    }
	
	public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
