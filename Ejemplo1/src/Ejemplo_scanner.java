import java.util.Scanner;

public class Ejemplo_scanner {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad = 0;
		cantidad = cantidadAlumnos();
		altaAlumnos(cantidad);
		volverAinscribir(cantidad);
		
		
	}

	public static int cantidadAlumnos() {
		System.out.println("Introduce el número de alumnos que quiere registrar");
		int cantidad = entrada.nextInt();
		entrada.nextLine();
		
		return cantidad;
		
	}

	public static void altaAlumnos(int cantidad) {
		int numeroAlumno = 1;
		int longitud = cantidad * 3;

		String[] alumnos = new String[longitud];
		for (int i = 0; i < longitud; i += 3) {
			System.out.println("Introduce el nombre del alumno " + numeroAlumno);
			alumnos[i] = entrada.nextLine();
			System.out.println("Introduce tus appellidos: ");
			alumnos[i + 1] = entrada.nextLine();
			System.out.println("Introduce tu edad: ");
			int edad = entrada.nextInt();
			entrada.nextLine();
			alumnos[i + 2] = Integer.toString(edad);
			numeroAlumno ++;
		}
		System.out.println("LISTA:");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("- " + alumnos[i]);
		}
	}
	public static void volverAinscribir(int cantidad) { // NO VA
		cantidad ++;
		int longitud = cantidad * 3;
		
		System.out.println("¿Desea añadir a un nuevo alumno?");
		String decision = entrada.nextLine();
			if(decision.equals("si")) {
				longitud ++;
				String[] alumnos = new String[longitud];
				System.out.println("Introduce el nombre del nuevo alumno: ");
				alumnos[longitud ] = entrada.nextLine();
				longitud ++;
				System.out.println("Introduce el appellido del nuevo alumno: ");
				int edad = entrada.nextInt();
				alumnos[longitud] = Integer.toString(edad);
				entrada.nextLine();
				System.out.println("Introduce la edad del nuevo alumno: ");
				longitud ++;
				alumnos[longitud] = entrada.nextLine();
				System.out.println("LISTA:");
				for (int i = 0; i < alumnos.length; i++) {
					System.out.println("- " + alumnos[i]);
				}
			}else
				System.out.println("Genial, muchas gracias.");
	}
}
// PISTAS
	//String.valueof(numero);
