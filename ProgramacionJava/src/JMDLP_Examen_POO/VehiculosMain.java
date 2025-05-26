package JMDLP_Examen_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiculosMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numBarcos = 2;
		int opcion = 0;
		ArrayList<Barco> Barco = new ArrayList<>();
		ArrayList<Avion> Avion = new ArrayList<>();
		ArrayList<Coche> Coche = new ArrayList<>();
		
		// Dos barcos:
		Barco barco1 = new Barco("Nike", "rojo", "12344", 12345, 1987, 3, 7, TipoVela.VELA);
		Barco.add(barco1);
		Barco barco2 = new Barco("Adidas", "azul", "1234544", 1234345, 1985, 6, 9, TipoVela.PASAJEROS);
		Barco.add(barco2);
		
		// Dos aviones:
		Avion avion1 = new Avion("Samsung", "naranja", "123454544", 12343435, 1995, (byte) 2, 300000.00, false);
		Avion.add(avion1);
		Avion avion2 = new Avion("Apple", "Amarillo", "12345445544", 12343435, 1995, (byte) 4, 600000.00, true);
		Avion.add(avion2);
		System.out.println("Creame dos coches");		
		System.out.println("Coche 1");
		Coche coche1 = crearCoche(entrada);
		Coche.add(coche1);
		System.out.println("Coche 2");
		Coche coche2 = crearCoche(entrada);
		
		do {
			mostrarMenu();
			opcion = entrada.nextInt();
			entrada.nextLine();
			ejecutarFuncion(entrada, opcion, Barco, Avion, Coche);
		}while(opcion != 5);
		
		
	}
	public static Coche crearCoche(Scanner entrada) {
		String decisionAntiguo;
		boolean esAntiguo = false;
		String decisionElectrico;
		boolean esElectrico = false;
		System.out.println("Introduce la marca:");
		String marca = entrada.nextLine();
		System.out.println("Introduce el color");
		String color = entrada.nextLine();
		System.out.println("Dime el numero del bastidor.");
		String numBastidor = entrada.nextLine();
		System.out.println("Dime la cantidad total de kilómetros que tiene");
		int totalKilom = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Dime el año de fabricación");
		int anoFabricacion = entrada.nextInt();
		entrada.nextLine();
		System.out.println("¿El vehiculo es eléctrico? (si o no)");
		decisionElectrico = entrada.nextLine();
		if (decisionElectrico.toLowerCase().equals("si")) {
			esElectrico = true;
		}else {
			esElectrico = false;
		}
		System.out.println("¿El vehiculo es antiguo? (si o no)");
		decisionAntiguo = entrada.nextLine();
		if (decisionAntiguo.toLowerCase().equals("si")) {
			esAntiguo = true;
		}else {
			esAntiguo = false;
		}
		Coche nuevoCoche = new Coche(marca, color, numBastidor, totalKilom, anoFabricacion, esElectrico, esAntiguo);
		return nuevoCoche;
		
	}
	public static void mostrarMenu() {
			System.out.println("Elige una opcion");
			System.out.println("1. Mostrar todos los objetos.");
			System.out.println("2. Cuantos vehiculos hay.");
			System.out.println("3. Cuantos aviones son de combate y cuantos coches son eléctricos.");
			System.out.println("4. Cambiar un dato del coche.");
			System.out.println("5. Salir");
	}
	public static void ejecutarFuncion(Scanner entrada, int opcion, ArrayList<Barco> Barco, ArrayList<Avion> Avion, ArrayList<Coche> Coche) {
		switch(opcion) {
		case 1:
			System.out.println("Barcos: ");
			for(Barco barcoAimprimir : Barco) {
				System.out.println(barcoAimprimir.toString());
			}
			System.out.println("Aviones: ");
			for(Avion avionAimprimir : Avion) {
				System.out.println(avionAimprimir.toString());
			}
			System.out.println("Coches: ");
			for(Coche cocheAimprimir : Coche) {
				System.out.println(cocheAimprimir.toString());
			}
			break;
		case 2:
			int numBarcos = 0;
			int numAviones = 0;
			int numCoches = 0;
			for(Barco barcoAimprimir : Barco) {
				numBarcos++;
			}
			
			for(Avion avionAimprimir : Avion) {
				numAviones++;
			}
			
			for(Coche cocheAimprimir : Coche) {
				numCoches++;
			}
			int totalVehiculos = numBarcos + numAviones + numCoches;
			System.out.println("Hay " + totalVehiculos + " vehiculos.");
			System.out.println();
			break;
		case 3:
			int numAvionesCombate = 0;
			int numCochesElec = 0;
			System.out.println("Aviones de combate: ");
			for(Avion avionAimprimir : Avion) {
				System.out.println(avionAimprimir.toString());
				if(avionAimprimir.isCombate()==true) {
					numAvionesCombate++;
				}
			}
			System.out.println("Hay " + numAvionesCombate + " aviones de combate.");
			System.out.println();
			System.out.println("Coches electricos: ");
			for(Coche cocheAimprimir : Coche) {
				if(cocheAimprimir.isElectrico()==true) {
					numCochesElec++;
				}
			}
			System.out.println("Hay " + numCochesElec + " coches eléctricos.");
			System.out.println();
			break;
		case 4:
			int opcionCambio = 0;
			Coche cocheEncontrado = null;
			System.out.println("Selecciona el coche que quieras cambiar: ");
			System.out.println("Introduce el numero de bastidor para saber que coche es el que quieres seleccionar: ");
			String numeroBastiABuscar = entrada.nextLine();
			for(Coche coche: Coche) {
				String idBasti = coche.getNumBastidor();
				if (idBasti.equals(numeroBastiABuscar)) {
					cocheEncontrado = coche;
				}
			}
			System.out.println("1. Marca");
			System.out.println("2. Color");
			opcionCambio = entrada.nextInt();
			entrada.nextLine();
			if (opcionCambio == 1) {
				cocheEncontrado.setMarca("DAYSON");
			}else {
				cocheEncontrado.setColor("AMARILLO");
			}
			break;
		case 5: 
			System.out.println("Saliendo...");
			break;
			default:
				System.out.println("Seleccione una opcion correcta.");
				break;
	}
	}
	

}
