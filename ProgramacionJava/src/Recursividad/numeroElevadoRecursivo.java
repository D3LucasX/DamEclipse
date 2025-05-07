package Recursividad;
import java.util.Scanner;
public class numeroElevadoRecursivo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el numero quie quieres elevar: ");
		int numero = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Dime A que número lo quieres elevar: ");
		int elevarA = entrada.nextInt();
		int resultado = elevarNumero(numero, elevarA);
		System.out.println("El Resultado es: " + resultado);
	}
	
	public static int elevarNumero(int n, int elevar) {
		if(elevar == 0) {
			return 1;
		}else {
			return n * elevarNumero(n , elevar-1);
		}
	}
	

}
