package TallerMecanicoPruebaExamen;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class TallerMecanicoMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Vehiculos> vehiculos = new ArrayList<>();
		ArrayList<Reparaciones> reparaciones = new ArrayList<>();
		ArrayList<Propietarios> usuarios = new ArrayList<>();
		TallerMecanico TallerJose = new TallerMecanico("TallerJose",vehiculos, reparaciones);
		
		int opcion = 0;
		
		do {
			mostrarMenu();
			opcion = entrada.nextInt();
			entrada.nextLine();
			ejecutarOpcion(opcion, entrada, usuarios, vehiculos, TallerJose, reparaciones);
		}while(opcion != 10);
	}
	public static Vehiculos darDeAlta(Scanner entrada, ArrayList<Vehiculos> vehiculos) {
		String DecisionCoche;
		boolean esCoche = false;
		String ultimoRegistro;
		String marca;
		String modelo;
		String color;
		int ano;
		int precioSalida;
		double velocidadMaxima;
		int numeroPuertas;
		String combustible;
		TipoCombustible tipoCombus = null;
		int valido = 0;
		boolean airbag = false;
		String decisionAirbag;
		boolean automatico = false;
		String decisionAutomatico;
		boolean sidecar = false;
		String decisionSidecar;
		boolean deportiva = false;
		String decisionDeportiva;
		int cilindrada = 0;
		Vehiculos nuevoVehiculo = new Vehiculos();
		System.out.println("¿Es un coche?");
		DecisionCoche = entrada.nextLine();
		esCoche = nuevoVehiculo.esCoche(DecisionCoche);
		if (esCoche) {
			if (!vehiculos.isEmpty()) {
				ultimoRegistro = vehiculos.get(vehiculos.size() - 1).getIdRegistro();
				int UltiRegNum= Integer.parseInt(ultimoRegistro) + 1;
				ultimoRegistro = Integer.toString(UltiRegNum);
			}else {
				ultimoRegistro = "1";
			}
			System.out.println("Escribe la marca");
			marca = entrada.nextLine();
			System.out.println("Introduce el modelo.");
			modelo = entrada.nextLine();
			System.out.println("Introduce el color");
			color = entrada.nextLine();
			System.out.println("Introduce el año");
			ano = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Precio de salida?");
			precioSalida = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Velocidad máxima?");
			velocidadMaxima = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("¿Cuantas puertas tiene?");
			numeroPuertas = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Que tipo de combustible consume (DIESEL O GASOLINA)");
			combustible = entrada.nextLine();
			while (valido == 0) {
				if (combustible.toUpperCase().equals("DIESEL")) {
					tipoCombus = TipoCombustible.DIESEL;
					valido = 1;
				}else if (combustible.toUpperCase().equals("GASOLINA")) {
					tipoCombus = TipoCombustible.GASOLINA;
					valido = 1;
				}else{
					System.out.println("Introduzca un daato válido.");
					valido = 0;
				}
			}
			valido = 0;
			System.out.println("¿Tiene AirBag? (is o no)");
			decisionAirbag = entrada.nextLine();
			while (valido == 0) {
				if (decisionAirbag.toLowerCase().equals("si")) {
					airbag = true;
					valido = 1;
				}else if (decisionAirbag.toLowerCase().equals("no")) {
					airbag = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			valido = 0;
			System.out.println("¿Es automático? (is o no)");
			decisionAutomatico = entrada.nextLine();
			while (valido == 0) {
				if (decisionAutomatico.toLowerCase().equals("si")) {
					automatico = true;
					valido = 1;
				}else if (decisionAutomatico.toLowerCase().equals("no")) {
					automatico = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			Coches nuevoCoche = new Coches(ultimoRegistro, marca, modelo, color, ano, precioSalida, velocidadMaxima, numeroPuertas, tipoCombus, airbag, automatico);
			return nuevoCoche;
		}else {
			if (!vehiculos.isEmpty()) {
				ultimoRegistro = vehiculos.get(vehiculos.size() - 1).getIdRegistro();
				int UltiRegNum= Integer.parseInt(ultimoRegistro) + 1;
				ultimoRegistro = Integer.toString(UltiRegNum);
			}else {
				ultimoRegistro = "1";
			}
			System.out.println("Escribe la marca");
			marca = entrada.nextLine();
			System.out.println("Introduce el modelo.");
			modelo = entrada.nextLine();
			System.out.println("Introduce el color");
			color = entrada.nextLine();
			System.out.println("Introduce el año");
			ano = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Precio de salida?");
			precioSalida = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Velocidad máxima?");
			velocidadMaxima = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("¿Cilindrada?");
			cilindrada = entrada.nextInt();
			entrada.nextLine();
			valido = 0;
			System.out.println("¿Tiene sidecar? (is o no)");
			decisionSidecar = entrada.nextLine();
			while (valido == 0) {
				if (decisionSidecar.toLowerCase().equals("si")) {
					sidecar = true;
					valido = 1;
				}else if (decisionSidecar.toLowerCase().equals("no")) {
					sidecar = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			valido = 0;
			System.out.println("¿Es deportiva? (is o no)");
			decisionDeportiva = entrada.nextLine();
			while (valido == 0) {
				if (decisionDeportiva.toLowerCase().equals("si")) {
					deportiva = true;
					valido = 1;
				}else if (decisionDeportiva.toLowerCase().equals("no")) {
					deportiva = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			Motos nuevaMoto = new Motos(ultimoRegistro, marca, modelo, color, ano, precioSalida, velocidadMaxima, cilindrada, sidecar, deportiva);
			return nuevaMoto;
		}
	}
	public static Propietarios crearUsuario(Scanner entrada) {
		/*(String dni, String nombre, String cuentaBancaria,
				TallerMecanicoPruebaExamen.TipoSeguro tipoSeguro*/
		String dni;
		String nombre;
		String cuentaBancaria;
		TipoSeguro tipoSeg = null;
		String tipoSeguro;
		int valido = 0;
		System.out.println("----FORMULARIO DE INSCRIPCIÓN------");
		System.out.println("Numero de DNI");
		dni = entrada.nextLine();
		System.out.println("Nombre");
		nombre = entrada.nextLine();
		System.out.println("Numero de cuenta bancaria:");
		cuentaBancaria = entrada.nextLine();
		System.out.println("¿Que tipo de seguro tienes? (TERCEROS O TODO RIESGO)");
		tipoSeguro = entrada.nextLine();
		while (valido == 0) {
			if (tipoSeguro.toUpperCase().equals("TERCEROS")) {
				tipoSeg = TipoSeguro.TERCEROS;
				valido = 1;
			}else if (tipoSeguro.toUpperCase().equals("TODO RIESGO")) {
				tipoSeg = TipoSeguro.TODO_RIESGO;
				valido = 1;
			}else{
				System.out.println("Introduzca un daato válido.");
				valido = 0;
			}
		}
		Propietarios nuevoUsuario = new Propietarios(dni, nombre, cuentaBancaria, tipoSeg);
		return nuevoUsuario;
	}
	public static boolean estaUsuario(String dniPropietario,  ArrayList<Propietarios> usuarios) {
		String dniAbuscar;
		boolean existe = false;
		for (Propietarios usuarioAbuscar : usuarios) {
			dniAbuscar = usuarioAbuscar.getDni();
			if (dniAbuscar.equals(dniPropietario)) {
				existe = true;
			}else {
				existe = false;
			}
		}
		return existe;
	}
	public static void hacerReparacion(Scanner entrada, TallerMecanico TallerJose, ArrayList<Vehiculos> vehiculos, ArrayList<Propietarios> usuarios, ArrayList<Reparaciones> reparaciones ) {
		Vehiculos vehiculoAreparar = null;
		Propietarios propietarioReparacion = null;
		String dniPropietario;
		String idAcomparar;
		String idAbuscar;
		String dniaBuscar;
		String dniAcomparar;
		String comentario;
		String decisionComent;
		boolean estaElVehiculo = false;
		System.out.println("Introduce el dni del usuario");
		dniaBuscar = entrada.nextLine();
		boolean existeElUsuario = estaUsuario(dniaBuscar, usuarios);
		
		if(existeElUsuario) {
			for (Propietarios usuarioReparacion : usuarios) {
				dniAcomparar = usuarioReparacion.getDni();
				if(dniAcomparar.equals(dniaBuscar)) {
					propietarioReparacion = usuarioReparacion;
				}
			}
			System.out.println("Introduzca el id de registro del vehiculo: ");
			idAbuscar = entrada.nextLine();
			estaElVehiculo = TallerJose.estaElVehiculo(idAbuscar);
			if (estaElVehiculo) {
				for(Vehiculos vehiculo : vehiculos) {
					idAcomparar = vehiculo.getIdRegistro();
					if (idAcomparar.equals(idAbuscar)) {
						vehiculoAreparar = vehiculo;
					}
				}
				System.out.println("¿Quieres añadir un comentario? (si o no)");
				decisionComent = entrada.nextLine();
				if (decisionComent.toLowerCase().equals("si")) {
					System.out.println("Agregue el comentario: ");
					comentario = entrada.nextLine();
				}else {
					comentario = null;
				}
				Reparaciones nuevaReparacion = new Reparaciones(vehiculoAreparar, propietarioReparacion, LocalDate.now(),comentario);
				reparaciones.add(nuevaReparacion);
				System.out.println("Reparacion registrada con exito");
			}else {
				System.out.println("Primero debe registrar su vehiculo.");
			}
		}else {
			System.out.println("Primero debe de darse de alta en nuestro sistema.");
		}
	}
	public static void mostrarListaDeUsuarios(ArrayList<Propietarios> propietarios) {
		for (Propietarios propietarioAimprimir : propietarios) {
			System.out.println(propietarioAimprimir.toString());
		}
	}
	public static void mostrarUsuPorId(String dniAcomparar , ArrayList<Propietarios> usuarios) {
		for (Propietarios propietarioAbuscar : usuarios) {
			String dniPropietarioAbuscar = propietarioAbuscar.getDni();
			if (dniPropietarioAbuscar.equals(dniAcomparar)) {
				System.out.println(propietarioAbuscar.toString());
			}
		}
	}
	public static void mostrarMenu() {
		System.out.println("----Menu del taller----");
		System.out.println("1. Dar de alta a un paciente. ");
		System.out.println("2. Registrar un vehiculo.");
		System.out.println("3. Registrar una reparación.");
		System.out.println("4. Mostrar lista de usuarios.");
		System.out.println("5. Mostrar Usuario por Id.");
		System.out.println("6. Mostrar todos los vehiculos.");
		System.out.println("7. Mostrar los vehiculos por id.");
		System.out.println("8. Mostrar Listado de reparaciones.");
		System.out.println("9. Mostrar reparaciones por usuario");
		System.out.println("10.Salir.");
		System.out.println("Elige una opción:");
	}
	public static void ejecutarOpcion(int opcion, Scanner entrada, ArrayList<Propietarios> propietarios, ArrayList<Vehiculos> vehiculos, TallerMecanico tallerJose, ArrayList<Reparaciones> reparaciones) {
		switch (opcion){
		case 1:
			Propietarios nuevoPropietario = crearUsuario(entrada);
			propietarios.add(nuevoPropietario);
			break;
		case 2:
			Vehiculos vehiculoNuevo = darDeAlta(entrada, vehiculos);
			vehiculos.add(vehiculoNuevo);
			break;
		case 3:
			hacerReparacion(entrada,  tallerJose, vehiculos, propietarios, reparaciones);
			break;
		case 4:
			mostrarListaDeUsuarios(propietarios);
			break;
		case 5:
			System.out.println("Escribeme el Dni del usuario que quieras buscar: ");
			String dniAcomparar = entrada.nextLine();
			mostrarUsuPorId(dniAcomparar, propietarios);
			break;
		case 6:
			tallerJose.mostrarVehiculos(vehiculos);
			break;
		case 7:
			System.out.println("introduce el Id de registro del vehículo: ");
			String idAbuscar = entrada.nextLine();
			tallerJose.mostrarVehiculosPorId(idAbuscar, vehiculos);
			break;
		case 8:
			tallerJose.mostrarReparaciones(reparaciones);
			break;
		case 9:
			Propietarios PropietarioAbuscar1 = null;
			System.out.println("escribe el Dni");
			idAbuscar = entrada.nextLine();
			for (Propietarios propietario : propietarios) {
				dniAcomparar = propietario.getDni();
				if (dniAcomparar.equals(idAbuscar)) {
					PropietarioAbuscar1 = propietario;
				}
			}
			mostrarReparacionesPorId(propietarios, reparaciones, PropietarioAbuscar1, entrada );
			break;
		case 10:
			System.out.println("Saliendo...");
			break;
			default:
				System.out.println("No ha elegido ninguna opcion válida.");
				break;
		}
		
	}
	public static void mostrarReparacionesPorId(ArrayList<Propietarios> usuarios, ArrayList<Reparaciones> reparaciones, Propietarios propietario, Scanner entrada ) {
		String idAbuscar;
		String dniAcomparar;
		if (reparaciones == null) {
			System.out.println("No hay reparaciones registradas.");			
		}else {
			for (Reparaciones reparacionAbuscar : reparaciones) {
				if (reparacionAbuscar.getPropietario().equals(propietario)) {
					System.out.println(reparacionAbuscar.toString());
				}
			}
		}
	}
}

