package Colegio;
import java.util.ArrayList;
import java.util.Scanner;

import Colegio.Ejercicio3Profesor;


public class Ejecicio3ClasesPrueba {

	    public static ArrayList<Ejercicio3Administracion> admins = new ArrayList<>();
	    public static ArrayList<Ejercicio3Alumno> alumnos = new ArrayList<>();
	    public static ArrayList<Ejercicio3Directivo> directivos = new ArrayList<>();
	    public static ArrayList<Ejercicio3Profesor> profesores = new ArrayList<>();
	    public static ArrayList<Ejercicio3Clases> clases = new ArrayList<>();

	public static void main(String[] args) {

		int opcionEntrada=0;
		do {
		Scanner entrada = new Scanner(System.in);
		opcionEntrada = MostrarMenu(entrada);
		ejecutarOpcion(opcionEntrada, entrada);
		}while(opcionEntrada < 7);
		
	}
	
	
	public static void ejecutarOpcion(int opcion, Scanner entrada) {
	    int cantidad = 0;
	    switch (opcion) {
	        case 1:
	            System.out.println("¿Cuántos Administradores desea crear?");
	            cantidad = entrada.nextInt();
	            entrada.nextLine();
	            for (int i = 0; i < cantidad; i++) {
	                admins.add(crearAdmin(entrada));
	            }
	            break;
	        case 2:
	            System.out.println("¿Cuántos Alumnos desea crear?");
	            cantidad = entrada.nextInt();
	            entrada.nextLine();
	            for (int i = 0; i < cantidad; i++) {
	                alumnos.add(crearAlumno(entrada));
	            }
	            break;
	        case 3:
	            System.out.println("¿Cuántos Directivos desea crear?");
	            cantidad = entrada.nextInt();
	            entrada.nextLine();
	            for (int i = 0; i < cantidad; i++) {
	                directivos.add(crearDirectivo(entrada));
	            }
	            break;
	        case 4:
	            System.out.println("¿Cuántos Profesores desea crear?");
	            cantidad = entrada.nextInt();
	            entrada.nextLine();
	            for (int i = 0; i < cantidad; i++) {
	                profesores.add(crearProfesor(entrada));
	            }
	            break;
	        case 5:
	            System.out.println("¿Cuántos Módulos desea crear?");
	            cantidad = entrada.nextInt();
	            entrada.nextLine();
	            for (int i = 0; i < cantidad; i++) {
	                clases.add(crearClase(entrada));
	            }
	            break;
	        case 6:
	            MostrarTodo();
	            break;
	        case 7:
	        	System.out.println("Saliendo...");
	        	break;
	        default:
	            System.out.println("Opción no válida.");
	    }
	}
	
	public static void MostrarTodo() {
		System.out.println("---- ADMINISTRATIVOS ----");
		int contador = 1;
        for (Ejercicio3Administracion Administradores : admins) {
            System.out.println("Administrativo numero " + contador + ": " + Administradores);
            contador ++;
        }
        contador = 1;
        System.out.println("---- ALUMNOS ----");
        for (Ejercicio3Alumno Alumnos : alumnos) {
            System.out.println("Alumno numero " + contador + ": " + Alumnos);
            contador++;
        }
        contador = 1;
        System.out.println("---- DIRECTIVOS ----");
        for (Ejercicio3Directivo Directivos : directivos) {
            System.out.println("Directivo numero " + contador + ": " + Directivos);
            contador++;
        }
        contador = 1;
        System.out.println("---- PROFESORES ----");
        for (Ejercicio3Profesor Profesores : profesores) {
            System.out.println("Profesor numero " + contador + ": " + Profesores);
            contador++;
        }
        contador = 1;
        System.out.println("---- CLASES ----");
        for (Ejercicio3Clases Modulos : clases) {
            System.out.println("Modulo numero " + contador + ": " + Modulos);
            contador++;
        }
    }
	
	public static int MostrarMenu(Scanner entrada) {
		 System.out.println("\n¿Qué opción desea elegir? (indique el número correspondiente)");
	        System.out.println("1. Crear Administrador");
	        System.out.println("2. Crear Alumno");
	        System.out.println("3. Crear Directivo");
	        System.out.println("4. Crear Profesor");
	        System.out.println("5. Crear Clase");
	        System.out.println("6. Mostrar Todo");
	        System.out.println("7. Salir");
		int OpcionCreacion = entrada.nextInt();
		entrada.nextLine();
		return OpcionCreacion;
	}
	
	public static Ejercicio3Administracion crearAdmin(Scanner entrada) {

				System.out.println("DNI: ");
				String dni = entrada.nextLine();
				System.out.println("Nombre: ");
				String nombre = entrada.nextLine();
				System.out.println("Apellidos: ");
				String apellidos = entrada.nextLine();
				System.out.println("Salario: ");
				int salario = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Estudios: ");
				String estudios = entrada.nextLine();
				System.out.println("Antigüedad: ");
				int permanencia = entrada.nextInt();
				entrada.nextLine();
			
				return new Ejercicio3Administracion(dni,nombre, apellidos,salario, estudios, permanencia);
		}
	public static Ejercicio3Directivo crearDirectivo(Scanner entrada) {
		int decisionSale = 0;
		int decisionTurno = 0;
		boolean esSale = false;
		boolean esMañana = false;
			
		System.out.println("DNI: ");
		String dni = entrada.nextLine();
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Apellidos: ");
		String apellidos = entrada.nextLine();
		System.out.println("Salario: ");
		int salario = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Estudios: ");
		String estudios = entrada.nextLine();
		while (decisionSale != 1 && decisionSale != 2) {
		System.out.println("¿Es salesiano?");
		decisionSale = entrada.nextInt();
		entrada.nextLine();
		}
		if (decisionSale == 1) {
			esSale = true;
		}else {
			esSale = false;
		}
		while (decisionSale != 1 && decisionSale != 2) {
			System.out.println("¿Turno de mañana?");
			decisionTurno = entrada.nextInt();
			entrada.nextLine();
			}
			if (decisionTurno == 1) {
				esMañana = true;
			}else {
				esMañana = false;
			}
		
		return new Ejercicio3Directivo(dni,nombre, apellidos,salario, esSale,esMañana);
}
	public static Ejercicio3Alumno crearAlumno(Scanner entrada) {
		int decisionRepetidor = 0;
		boolean esRepetidor = false;

		System.out.println("DNI: ");
		String dni = entrada.nextLine();
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Apellidos: ");
		String apellidos = entrada.nextLine();
		System.out.println("Fecha de nacimineto: ");
		String FechaNacimiento = entrada.nextLine();
		System.out.println("Sexo: ");
		String sexo = entrada.nextLine();
		while (decisionRepetidor != 1 && decisionRepetidor != 2) {
			System.out.println("¿Es repetidor?");
			decisionRepetidor = entrada.nextInt();
			entrada.nextLine();
			}
			if (decisionRepetidor == 1) {
				esRepetidor = true;
			}else {
				esRepetidor = false;
			}
			
			if (clases.isEmpty()) {
	            System.out.println("No hay clases disponibles. Crea una primero.");
	            return null;
	        }

	        System.out.println("Clases disponibles:");
	        for (int i = 0; i < clases.size(); i++) {
	            System.out.println(i + ": " + clases.get(i).getNombre());
	        }

	        System.out.println("Seleccione el índice de la clase a la que asistirá el alumno:");
	        int seleccion = entrada.nextInt();
	        entrada.nextLine();

	        if (seleccion < 0 || seleccion >= clases.size()) {
	            System.out.println("Índice inválido. No se creó el alumno.");
	            return null;
	        }

	        Ejercicio3Clases[] claseAlumno = new Ejercicio3Clases[1];
	        claseAlumno[0] = clases.get(seleccion);
	
		return new Ejercicio3Alumno(dni,nombre, apellidos,FechaNacimiento, sexo, esRepetidor, claseAlumno);
}
	
	public static Ejercicio3Profesor crearProfesor(Scanner entrada) {
		//String dni, String nombre, String apellidos, int salario, int numero_asignatuas, boolean tutor
		int decisionTutor = 0;
		boolean esTutor = false;
		System.out.println("DNI: ");
		String dni = entrada.nextLine();
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Apellidos: ");
		String apellidos = entrada.nextLine();
		System.out.println("Salario: ");
		int salario = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Numero Asignaturas: ");
		int numAsignaturas= entrada.nextInt();
		while (decisionTutor != 1 && decisionTutor != 2) {
			System.out.println("¿Es repetidor?");
			decisionTutor = entrada.nextInt();
			entrada.nextLine();
			}
			if (decisionTutor == 1) {
				esTutor = true;
			}else {
				esTutor = false;
			}
		
	
		return new Ejercicio3Profesor(dni,nombre, apellidos,salario, numAsignaturas, esTutor);
	}
	

	public static Ejercicio3Clases crearClase(Scanner entrada) {
		int decisionConvidable = 0;
		boolean esConvidable = false;
		int seleccion = 0;
		Ejercicio3Profesor profesor;
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Horas: ");
		int horas = entrada.nextInt();
		entrada.nextLine();
		if(profesores.isEmpty()) {
				System.out.println("No hay profesores en la base de datosd, por favor, inserte uno a continuación: ");
				profesor = crearProfesor(entrada);
		}else {
			System.out.println("Seleccione el profesor que desea asignar a este Módulo: ");
			for(int i = 0; i < profesores.size(); i++) {
				System.out.println(i + ": " + profesores.get(i).getNombre());
			}
			do {
			System.out.println("Seleccione el índice del Profesor que asignará al Módulo");
			seleccion = entrada.nextInt();
		    entrada.nextLine();
		}while (seleccion < 0 || seleccion >= profesores.size());
			profesor =profesores.get(seleccion);
		}
		while (decisionConvidable != 1 && decisionConvidable != 2) {
			System.out.println("¿Es repetidor?");
			decisionConvidable = entrada.nextInt();
			entrada.nextLine();
			}
			if (decisionConvidable == 1) {
				esConvidable = true;
			}else {
				esConvidable = false;
			}
		
		return new Ejercicio3Clases(nombre, horas, profesor, esConvidable);
}
	
	
}
