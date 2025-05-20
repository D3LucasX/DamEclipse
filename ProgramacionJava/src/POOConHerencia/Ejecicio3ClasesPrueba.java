package POOConHerencia;
import java.util.Scanner;

import POO.Ejercicio3Profesor;
import POO.TipoCoche;
import POO.TipoSeguro;
import POO.coche;

public class Ejecicio3ClasesPrueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int OpcionCreacion = MostrarMenu(entrada);
		
	}
	
	public static void ejecutarOpcion(int opcion, Scanner entrada) {
		switch(opcion) {
		case 1:
				crearAdmin(opcion, entrada);
			break;
		case 2:
				crearDirectivo(opcion, entrada);
			break;
		case 3:
			crearProfesor(opcion, entrada);
		break;
		case 4:
			crearClase(opcion, entrada);
		break;
		case 5:
			MostrarTodo();
		break;
		default:	
			break;
		}
	}
	
	public static void MostrarTodo() {
		
	}
	
	public static int MostrarMenu(Scanner entrada) {
		System.out.println("Que opcion desea elegir(indiquela con el número correspondiente)");
		System.out.println("1. Crear Administrador"
				+ "2. Crear Alumno"
				+ "3. Crear Directivo"
				+ "4. Crear Profesor"
				+ "5. Crear clase"
				+ "6. Mostrar Todo "
				+ "7. salir." );
		int OpcionCreacion = entrada.nextInt();
		entrada.nextLine();
		return OpcionCreacion;
	}
	
	public static Ejercicio3Administracion crearAdmin(int opcion, Scanner entrada) {

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
	public static Ejercicio3Directivo crearDirectivo(int opcion, Scanner entrada) {
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
		while (decisionSale != 1 || decisionSale != 2) {
		System.out.println("¿Es salesiano?");
		decisionSale = entrada.nextInt();
		entrada.nextLine();
		}
		if (decisionSale == 1) {
			esSale = true;
		}else {
			esSale = false;
		}
		while (decisionSale != 1 || decisionSale != 2) {
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
	public static Ejercicio3Alumno crearAlumno(int opcion, Scanner entrada) {
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
		while (decisionRepetidor != 1 || decisionRepetidor != 2) {
			System.out.println("¿Es repetidor?");
			decisionRepetidor = entrada.nextInt();
			entrada.nextLine();
			}
			if (decisionRepetidor == 1) {
				esRepetidor = true;
			}else {
				esRepetidor = false;
			}
			
		Ejercicio3Clases[] clase = crearClase(opcion,entrada);
	
		return new Ejercicio3Alumno(dni,nombre, apellidos,FechaNacimiento, sexo, esRepetidor, clase);
}
	
	public static Ejercicio3Profesor crearProfesor(int opcion, Scanner entrada) {
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
		while (decisionTutor != 1 || decisionTutor != 2) {
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
	
	//String nombre, int horas, Ejercicio3Profesor unProfesor, boolean convalidable
	public static Ejercicio3Clases[] crearClase(int opcion, Scanner entrada) {
		int decisionConvidable = 0;
		boolean esConvidable = false;
		
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Horas: ");
		int horas = entrada.nextInt();
		entrada.nextLine();
		System.out.println("profesor: ");
		Ejercicio3Profesor profesor = crearProfesor(opcion,entrada);
		while (decisionConvidable != 1 || decisionConvidable != 2) {
			System.out.println("¿Es repetidor?");
			decisionConvidable = entrada.nextInt();
			entrada.nextLine();
			}
			if (decisionConvidable == 1) {
				esConvidable = true;
			}else {
				esConvidable = false;
			}
		//POdemos hacer mas clases con bucles y preguntando al usuario
		Ejercicio3Clases[] nueva;
		nueva[0]=new Ejercicio3Clases(nombre, horas,profesor, esConvidable);
			
		return nueva;
}
	
	
}
