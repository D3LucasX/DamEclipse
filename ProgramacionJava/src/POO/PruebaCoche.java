package POO;
import java.util.Scanner;
public class PruebaCoche {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cochesACrear = 0;
		int numero = 0;
		int decision = 0;
		coche marescutti = new coche("civic", "rojo", true, "4442GBX", 1996, TipoCoche.UTILITARIO, TipoSeguro.TODO_RIESGO);
		coche marcos = new coche ("leon", "azul", false, "3434KDL", 2004, TipoCoche.UTILITARIO, TipoSeguro.TERCEROS);
		System.out.println(marescutti.toString());
		
		System.out.println("Cuantos coches desea crear?");
		cochesACrear = entrada.nextInt();
		coche[] ArrayCoches = new coche[cochesACrear];
		
		do {
			
			System.out.println("Ingrese el coche " + numero);
			ArrayCoches[0] = crearCoche(entrada);
			numero++;
			while(decision != 0 || decision != 1) {
			System.out.println("Desea introducir otro coche? Introduce 1 si si, 0 si no");
			decision = entrada.nextInt();
			}
		}while(decision == 1);
		
		
	}
	
	public static  coche crearCoche(Scanner entrada) {
		
		int metalizado = 0;
		boolean esMetalizado = false;
		TipoCoche tipoCoche = null;
		TipoSeguro tipoSeguro = null;
		
		
			System.out.println("De quen es el coche(escriba solo el nombre)");
			
			System.out.println("tipo de coche:");
			String tipo = entrada.nextLine();
			System.out.println("Color del coche");
			String color = entrada.nextLine();
			System.out.println("Es metalizado? marque 1 si lo es, marque 0 si no lo es");
			metalizado = entrada.nextInt();
			entrada.nextLine();
			if(metalizado == 1) {
			esMetalizado = true;
			}
			System.out.println("Escribe la matrícula: ");
			String Matricula = entrada.nextLine();
			System.out.println("Escribe el año del coche: ");
			int anoCoche = entrada.nextInt();
			System.out.println("Que tipo de coche es? ");
			System.out.println("Elige una de estas opciones:");
			System.out.println(
					"1. Mini,"
					+ "2. Deportivo"
					+ "3. Utilitario"
					+ "4. Familiar"
					);
			int decisionTipoCoche = entrada.nextInt();
			while (decisionTipoCoche != 1 || decisionTipoCoche != 2 || decisionTipoCoche != 3 || decisionTipoCoche != 4) {
			switch(decisionTipoCoche) {
			case 1:
				tipoCoche = TipoCoche.MINI; 
				break;
			case 2:
				tipoCoche = TipoCoche.DEPORTIVO;
				break;
			case 3:
				tipoCoche = TipoCoche.UTILITARIO;
				break;
			case 4:
				tipoCoche = TipoCoche.FAMILIAR;
				break;
				default:
					System.out.println("No ha introducido un tipo de coche correcto, por favor, elija una opción del 1 al 4:");
			}
			}
			
			System.out.println("Que tipo de seguro es? ");
			System.out.println("Elige una de estas opciones:");
			System.out.println(
					"1. A terceros"
					+ "2. A todo riesgo"
					);
			int decisionTipoSeguro = entrada.nextInt();
			while (decisionTipoCoche != 1 || decisionTipoCoche != 2) {
			switch(decisionTipoCoche) {
			case 1:
				tipoSeguro = TipoSeguro.TERCEROS; 
				break;
			case 2:
				tipoSeguro = TipoSeguro.TODO_RIESGO;
				break;
				default:
					System.out.println("No ha introducido un tipo de seguro correcto, por favor, elija la opcion 1 o 2:");
			}
			}
			return new coche(tipo,color,esMetalizado,Matricula,anoCoche,tipoCoche,tipoSeguro );
	}
}
