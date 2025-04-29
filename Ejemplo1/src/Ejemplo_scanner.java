import java.util.Scanner;

public class Ejemplo_scanner {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad = 0;
		cantidad = cantidadAlumnos();
		String[] alumnos = altaAlumnos(cantidad);
		volverAinscribir(cantidad, alumnos);
		
		
	}
	// Esta funcion es la que pide el numero de alumnos a registrar
	public static int cantidadAlumnos() {
		System.out.println("Introduce el número de alumnos que quiere registrar");
		int cantidad = entrada.nextInt();
		entrada.nextLine();
		
		return cantidad;
		
	}

	// Esta funcion es la que pide los datos de los alumnos
	public static String[] altaAlumnos(int cantidad) {
		int numeroAlumno = 1;
		int longitud = cantidad * 3;

		String[] alumnos = new String[longitud]; //Esto es un array de String.
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
		return alumnos;
	}

	// Esta funcion es la que pregunta si se quiere añadir un nuevo alumno
	public static void volverAinscribir(int cantidad, String[]alumnos) { // NO VA
		//cantidad ++;
		//int longitud = cantidad * 3;
		cantidad ++;
		int longitud = cantidad * 3;
		
		System.out.println("¿Desea añadir a un nuevo alumno?");
		String decision = entrada.nextLine();
			if(decision.equalsIgnoreCase("si")) {
				String[] alumnos1 = new String[longitud];

				for (int i = 0; i < alumnos.length; i++){
					alumnos1[i] = alumnos[i];
				}
				int nuevoAlumnoIndex = alumnos.length;

				System.out.println("Introduce el nombre del nuevo alumno: ");
				alumnos1[nuevoAlumnoIndex] = entrada.nextLine();
				System.out.println("Introduce el appellido del nuevo alumno: ");
				alumnos1[nuevoAlumnoIndex +1] = entrada.nextLine();
				int edad = entrada.nextInt();
				alumnos1[nuevoAlumnoIndex +2] = Integer.toString(edad);
				entrada.nextLine();
			


				System.out.println("LISTA:");
				for (int i = 0; i < alumnos1.length; i++) {
					System.out.println("- " + alumnos1[i]);
				}
			}else
				System.out.println("Genial, muchas gracias.");
	}
}

